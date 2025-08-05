package android.support.constraint.motion;

import android.content.Context;
import android.support.constraint.ConstraintAttribute;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static int f1077a = -1;
    int b;
    int c;
    String d;
    protected int e;
    HashMap<String, ConstraintAttribute> f;

    public c() {
        int i = f1077a;
        this.b = i;
        this.c = i;
        this.d = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(Context context, AttributeSet attributeSet);

    public abstract void a(HashMap<String, r> hashMap);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(HashSet<String> hashSet);

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(String str) {
        String str2 = this.d;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    public void b(HashMap<String, Integer> hashMap) {
    }
}
