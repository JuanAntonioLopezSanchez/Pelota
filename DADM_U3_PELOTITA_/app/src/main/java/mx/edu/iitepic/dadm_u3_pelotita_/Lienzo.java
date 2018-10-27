package mx.edu.iitepic.dadm_u3_pelotita_;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Lienzo extends View {
    Pelota pelo1, pelo2, pelo3, pelo4, pelo5;

    public Lienzo(Context context) {
        super(context);
        pelo1 = new Pelota(200, 500, this, Color.RED, 70);
        pelo2 = new Pelota(60, 40, this, Color.BLUE, 55);
        pelo3 = new Pelota(800, 1000, this, Color.BLACK, 100);
        pelo4 = new Pelota(300, 300, this, Color.GRAY, 35);
       pelo5 = new Pelota(400, 400, this, Color.GREEN, 190);

        pelo1.mover(50, 15);
        pelo2.mover(80, 60);
        pelo3.mover(10, 10);
        pelo4.mover(50, 30);
        pelo5.mover(43, 40);

    }

    public void onDraw(Canvas c) {
        super.onDraw(c);
        Paint p = new Paint();
        pelo1.pintar(p, c);
        pelo2.pintar(p, c);
        pelo3.pintar(p, c);
        pelo4.pintar(p, c);
        pelo5.pintar(p, c);

    }
}