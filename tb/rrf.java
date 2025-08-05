package tb;

import android.database.ContentObserver;
import android.util.Log;

/* loaded from: classes9.dex */
public class rrf extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    private String f33330a;
    private int b;
    private rre c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public rrf(rre rreVar, int i, String str) {
        super(null);
        this.c = rreVar;
        this.b = i;
        this.f33330a = str;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        rre rreVar = this.c;
        if (rreVar != null) {
            rreVar.b(this.b, this.f33330a);
        } else {
            Log.e("VMS_SDK_Observer", "mIdentifierIdClient is null");
        }
    }
}
