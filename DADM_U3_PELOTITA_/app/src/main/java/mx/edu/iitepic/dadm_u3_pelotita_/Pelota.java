package mx.edu.iitepic.dadm_u3_pelotita_;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.CountDownTimer;

public class Pelota {
    float  x, y, rad;
    CountDownTimer timer;
    int desplazamientox, desplazamientoy, color;
    public Pelota(int posx, int posy, final Lienzo l, int c, int radio){
        x=posx;
        y=posy;
        color=c;
        rad=radio;
        timer=new CountDownTimer(1000,20) {
            @Override
            public void onTick(long millisUntilFinished) {
                x+=desplazamientox;
                if (x>=l.getWidth()-rad){
                    desplazamientox*=-1;
                }
                if (x<=rad){
                    desplazamientox*=-1;
                }
                y+=desplazamientoy;
                if (y>=l.getHeight()-rad){
                    desplazamientoy*=-1;
                }
                if (y<=rad){
                    desplazamientoy*=-1;
                }
                l.invalidate();
            }

            @Override
            public void onFinish() {
                start();
            }
        };
    }

    public void mover(int desplazax, int desplazay) {
        desplazamientox=desplazax;
        desplazamientoy=desplazay;
        timer.start();
    }

    public void pintar(Paint p, Canvas c) {
        p.setColor(color);
        c.drawCircle(x,y,rad,p);
    }
}

