package tb;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public interface mza extends Iterable<Map.Entry<String, String>> {
    @Override // java.lang.Iterable
    Iterator<Map.Entry<String, String>> iterator();
}
