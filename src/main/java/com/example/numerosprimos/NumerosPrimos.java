package com.example.numerosprimos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;
    public class NumerosPrimos {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the N numbers you wish to obtain.: ");
            int N = scanner.nextInt();

            generatePrime(N);
        }

        public static void generatePrime(int N) {
            int count = 0;
            int num = 2;

            while (count < N) {
                if (esPrimo(num)) {
                    System.out.println(num);
                    count++;
                }
                num++;
            }
        }

        public static boolean esPrimo(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
