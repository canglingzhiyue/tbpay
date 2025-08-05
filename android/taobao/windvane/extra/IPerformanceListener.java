package android.taobao.windvane.extra;

import java.util.Map;

/* loaded from: classes.dex */
public interface IPerformanceListener {
    public static final int FLAG_WHITE_PAGE = 1;
    public static final int TYPE_WHITE_PAGE = 1;

    int getFlag();

    void onPerformanceEventOccur(int i, Map<String, String> map);
}
