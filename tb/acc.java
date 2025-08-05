package tb;

import android.app.Activity;
import android.os.Build;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;

/* loaded from: classes2.dex */
public final class acc {

    /* renamed from: a  reason: collision with root package name */
    private Object f25230a;

    private acc(Object obj) {
        this.f25230a = obj;
    }

    public static acc a(Activity activity, DragEvent dragEvent) {
        DragAndDropPermissions requestDragAndDropPermissions;
        if (Build.VERSION.SDK_INT < 24 || (requestDragAndDropPermissions = activity.requestDragAndDropPermissions(dragEvent)) == null) {
            return null;
        }
        return new acc(requestDragAndDropPermissions);
    }
}
