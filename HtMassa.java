/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasproject;

/**
 *
 * @author 21102052/sudarma
 */
public class HtMassa{
    private float ja, se;
    
    public void SetJarak(float nil){
        this.ja = nil;
    }
    public void SetWaktu(float nil){
        this.se = nil;
    }
    public float GetJarak(){
        return this.ja;
    }
    public float GetWaktu(){
        return this.se;
    }
    public float HitungHasil(){
        return this.ja/this.se;
    }
}

