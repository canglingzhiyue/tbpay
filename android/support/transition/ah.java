package android.support.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.network.impl.ResponseProtocolType;

/* loaded from: classes2.dex */
public class ah {
    public View b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f1277a = new HashMap();
    final ArrayList<Transition> c = new ArrayList<>();

    public boolean equals(Object obj) {
        if (obj instanceof ah) {
            ah ahVar = (ah) obj;
            return this.b == ahVar.b && this.f1277a.equals(ahVar.f1277a);
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.f1277a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n") + "    values:";
        for (String str2 : this.f1277a.keySet()) {
            str = str + "    " + str2 + ResponseProtocolType.COMMENT + this.f1277a.get(str2) + "\n";
        }
        return str;
    }
}
