/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasproject;

/**
 *
 * @author 21102052/sudarma
 */
public class HtPotensial extends RumusFisika {
    private float ma, ti, ga;
    
    public void SetMassa(float nil){
        this.ma = nil;
    }
    public void SetGravitasi(float nil){
        this.ga = nil;
    }
    public void SetTinggi(float nil){
        this.ti = nil;
    }
    public float GetMassa(){
        return this.ma;
    }
    public float GetGravitasi(){
        return this.ga;
    }
    public float GetTinggi(){
        return this.ti;
    }
    public float HitungHasil(){
        return this.ma * this.ti * this.ga;
    }
}

