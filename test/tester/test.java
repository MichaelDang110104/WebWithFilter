/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

import dao.AccountDAO;
import dao.CategoryDAO;
import dao.ProductDAO;
import entity.Account;
import entity.Category;
import entity.Products;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michael Dang
 */
public class test {

    public static void main(String[] args) throws ParseException {
        double a[] = {409,
410,
410,
411,
413,
416,
416,
418,
419,
421,
422,
423,
425,
426,
426,
428,
428,
431,
431,
433,
435,
436,
436,
437};
        double mean=0; double variance=0;
        for(int i =0 ; i<a.length;i++){
            mean+=a[i];
        }
        System.out.println(mean);
        System.out.println(variance);
    }
}
