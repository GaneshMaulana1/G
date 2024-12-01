/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
// Class Matematika
public class Matematika {
    public int tambah(int a, int b){
        return a + b;
    }
    public int kali(int a, int b){
        return a * b;
    }
}
// Class Matematika Canggih
class MatematikaCanggih extends Matematika{
    public int modulus(int a, int b){
        return a % b;
    }
}
