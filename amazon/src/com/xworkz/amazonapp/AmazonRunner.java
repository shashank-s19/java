package com.xworkz.amazonapp;

import com.xworkz.amazonapp.constants.PaymentMethod;
import com.xworkz.amazonapp.amazondto.AmazonDto;
import com.xworkz.amazonapp.generateamazon.Amazon;

public class AmazonRunner {

    public static void main(String[] args) {

        System.out.println("----------------------------------");

        AmazonDto dto = new AmazonDto();
        dto.setCustomerName("Akhil Raj");
        dto.setEmail("akhilraj@gmail.com");
        dto.setAddress("1st Cross, Indiranagar, Bangalore");
        dto.setContactNumber("9876543210");
        dto.setProductName("Wireless Mouse");
        dto.setQuantity(2);
        dto.setPrice(799.99);
        dto.setPaymentMethod(PaymentMethod.CREDIT_CARD);

        System.out.println("Customer Name: " + dto.getCustomerName());
        System.out.println("Email: " + dto.getEmail());
        System.out.println("Address: " + dto.getAddress());
        System.out.println("Contact Number: " + dto.getContactNumber());
        System.out.println("Product: " + dto.getProductName());
        System.out.println("Quantity: " + dto.getQuantity());
        System.out.println("Price: " + dto.getPrice());
        System.out.println("Payment Method: " + dto.getPaymentMethod());

        System.out.println("----------------------------------");

        Amazon amazon = new Amazon();
        amazon.placeOrder(dto);
    }
}
