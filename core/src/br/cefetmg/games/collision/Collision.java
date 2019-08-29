package br.cefetmg.games.collision;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Utilitário para verificação de colisão.
 *
 * @author fegemo <coutinho@decom.cefetmg.br>
 */
public class Collision {

    /**
     * Verifica se dois círculos em 2D estão colidindo.
     *
     * @param c1 círculo 1
     * @param c2 círculo 2
     * @return true se há colisão ou false, do contrário.
     */
    public static final boolean circlesOverlap(Circle c1, Circle c2) {
        Vector2 vetor = new Vector2(c1.x - c2.x, c1.y - c2.y);
        /*
        System.out.println(c1.x + " " + c1.y);
        System.out.println(c2.x + " " + c2.y);
        System.out.println(vetor.len());
         */
        if (vetor.len() <= c1.radius + c2.radius) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Verifica se dois retângulos em 2D estão colidindo. Esta função pode
     * verificar se o eixo X dos dois objetos está colidindo e então se o mesmo
     * ocorre com o eixo Y.
     *
     * @param r1 retângulo 1
     * @param r2 retângulo 2
     * @return true se há colisão ou false, do contrário.
     */
    public static final boolean rectsOverlap(Rectangle r1, Rectangle r2) {
        if ((r1.x + r1.width >= r2.x) && (r1.x <= r2.x + r2.width)
                && (r1.y + r1.height >= r2.y) && (r1.y <= r2.y + r2.height)) {
            return true;
        } else {
            return false;
        }
    }
}
