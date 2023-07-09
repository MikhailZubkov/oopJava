package ru.geekbrains.lesson5.models;

import ru.geekbrains.lesson5.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {


    private Collection<Table> tables;

    /**
     * Получение списка всех столиков
     * @return
     */
    public Collection<Table> loadTables(){
        if (tables == null){
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    /**
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param tableNo Номер столика
     * @param name Имя клиента
     * @return Номер брони
     */
    public int reservationTable(Date reservationDate, int tableNo, String name){
        for (Table table : tables) {
            if (table.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        return -1;
    }

    /**
     * TODO: Разработать метод самостоятельно в рамках домашнего задания
     * Удалить бронь столика
     */
    public void deleteReservationTable(int oldReservation){
        for (Table table : tables) {
            Reservation tempReservation = null;
            for (Reservation reservation : table.getReservations()) {
                if (reservation.getId() == oldReservation) {
                    tempReservation = reservation;
                }
            }
            if (tempReservation != null) {
                table.getReservations().remove(tempReservation);
                System.out.printf("Бронь %d отменена\n", oldReservation);
                break;
            }
        }

        //TODO: Для создания нового резерва столика стоит воспользоваться уже
        // существующим методом reservationTable
    }

}
