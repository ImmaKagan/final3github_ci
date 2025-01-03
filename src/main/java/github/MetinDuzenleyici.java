package github;
import org.apache.commons.lang3.StringUtils;

public final class MetinDuzenleyici {

	public static String bosluklariTemizle(String orjinal) {
		return StringUtils.deleteWhitespace(orjinal);
	}
		
		
	public static String kisaltveBuyutHarfeCevir(String orjinal) {
		return StringUtils.abbreviate(orjinal, ".",25).toUpperCase();
	}
}
	