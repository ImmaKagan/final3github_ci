package github;

import org.junit.Test;
import static org.junit.Assert.*;

public class MetinDuzenleyiciTest {

    @Test
    public void bosluklariTemizle_boslukVarsaOnlariTemizlemeli() {
        // GIVEN - ÖN KOŞULLAR
        String orjinal = "Y  A  Z I L I M ";

        // WHEN - BU AKSİYON GERÇEKLEŞTİĞİNDE
        String sonuc = MetinDuzenleyici.bosluklariTemizle(orjinal);

        // THEN - BUNLAR OLMALI
        assertEquals("beklenmedik sonuc", "YAZILIM", sonuc);
    }

    @Test
    public void bosluklariTemizle_boslukYoksaAyniSonucuVermeli() {
        // GIVEN - ÖN KOŞULLAR
        String orjinal = "DENEME";

        // WHEN - BU AKSİYON GERÇEKLEŞTİĞİNDE
        String sonuc = MetinDuzenleyici.bosluklariTemizle(orjinal);

        // THEN - BUNLAR OLMALI
        assertEquals("beklenmedik sonuc", orjinal, sonuc);
    }

    @Test
    public void bosluklariTemizle_bosMetinVarsaBosSonucDonmeli() {
        // GIVEN - ÖN KOŞULLAR
        String orjinal = "				";

        // WHEN - BU AKSİYON GERÇEKLEŞTİĞİNDE
        String sonuc = MetinDuzenleyici.bosluklariTemizle(orjinal);

        // THEN - BUNLAR OLMALI
        assertEquals("beklenmedik sonuc", "", sonuc);
    }

    @Test
    public void kisaltveBuyukHarfeCevir_kisaltipBuyukHarfeCevirir() {
        // GIVEN - ÖN KOŞULLAR
        String orjinal = "YAZILIM ORTAM VE ARAÇLARI";

        // WHEN - BU AKSİYON GERÇEKLEŞTİĞİNDE
        String sonuc = MetinDuzenleyici.kisaltveBuyutHarfeCevir(orjinal);

        // THEN - BUNLAR OLMALI
        assertEquals("beklenmedik sonuc", "YAZILIM ORTAM VE ARAÇLARI", sonuc);
    }
}
