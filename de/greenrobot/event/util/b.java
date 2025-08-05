package de.greenrobot.event.util;

import android.os.Bundle;

/* loaded from: classes9.dex */
public abstract class b<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final a f24785a;

    protected abstract T a(d dVar, Bundle bundle);

    /* JADX INFO: Access modifiers changed from: protected */
    public T a(d dVar, boolean z, Bundle bundle) {
        if (dVar.a()) {
            return null;
        }
        Bundle bundle2 = bundle != null ? (Bundle) bundle.clone() : new Bundle();
        if (!bundle2.containsKey(ErrorDialogManager.KEY_TITLE)) {
            bundle2.putString(ErrorDialogManager.KEY_TITLE, b(dVar, bundle2));
        }
        if (!bundle2.containsKey(ErrorDialogManager.KEY_MESSAGE)) {
            bundle2.putString(ErrorDialogManager.KEY_MESSAGE, c(dVar, bundle2));
        }
        if (!bundle2.containsKey(ErrorDialogManager.KEY_FINISH_AFTER_DIALOG)) {
            bundle2.putBoolean(ErrorDialogManager.KEY_FINISH_AFTER_DIALOG, z);
        }
        if (!bundle2.containsKey(ErrorDialogManager.KEY_EVENT_TYPE_ON_CLOSE) && this.f24785a.i != null) {
            bundle2.putSerializable(ErrorDialogManager.KEY_EVENT_TYPE_ON_CLOSE, this.f24785a.i);
        }
        if (!bundle2.containsKey(ErrorDialogManager.KEY_ICON_ID) && this.f24785a.h != 0) {
            bundle2.putInt(ErrorDialogManager.KEY_ICON_ID, this.f24785a.h);
        }
        return a(dVar, bundle2);
    }

    protected String b(d dVar, Bundle bundle) {
        return this.f24785a.f24784a.getString(this.f24785a.b);
    }

    protected String c(d dVar, Bundle bundle) {
        return this.f24785a.f24784a.getString(this.f24785a.a(dVar.f24787a));
    }
}
