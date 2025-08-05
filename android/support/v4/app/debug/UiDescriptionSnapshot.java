package android.support.v4.app.debug;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public class UiDescriptionSnapshot implements Snapshot {
    private static final String TAG = "UiDescriptionSnapshot";

    private StringBuilder doTakeSnapshot(int i, View view, StringBuilder sb) {
        sb.append(i);
        sb.append(view.toString());
        sb.append("\n");
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                doTakeSnapshot(i + 1, viewGroup.getChildAt(i2), sb);
            }
        }
        return sb;
    }

    @Override // android.support.v4.app.debug.Snapshot
    public String takeSnapshot(View view) {
        return doTakeSnapshot(0, view, new StringBuilder()).toString();
    }
}
