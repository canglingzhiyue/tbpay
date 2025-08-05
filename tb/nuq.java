package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.NavigableMap;
import kotlin.jvm.internal.q;

/* loaded from: classes8.dex */
public final class nuq extends nuo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(904463838);
    }

    public static /* synthetic */ Object ipc$super(nuq nuqVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.irz
    public void a(iry videoList) {
        int a2;
        int a3;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee404068", new Object[]{this, videoList});
            return;
        }
        q.c(videoList, "videoList");
        if (this.c.isEmpty()) {
            return;
        }
        NavigableMap<Integer, irw> mInScreenPlayable = this.c;
        q.a((Object) mInScreenPlayable, "mInScreenPlayable");
        if (a(mInScreenPlayable, videoList)) {
            return;
        }
        int F = videoList.F();
        int G = videoList.G();
        int D = videoList.D();
        int E = videoList.E();
        int i2 = -1;
        irw irwVar = null;
        NavigableMap<Integer, irw> mInScreenPlayable2 = this.c;
        q.a((Object) mInScreenPlayable2, "mInScreenPlayable");
        for (Map.Entry<Integer, irw> entry : mInScreenPlayable2.entrySet()) {
            Integer index = entry.getKey();
            irw cellPlayable = entry.getValue();
            q.a((Object) cellPlayable, "cellPlayable");
            int f = cellPlayable.f();
            int g = cellPlayable.g();
            if (f <= G && g >= F && (a3 = a(F, G, f, g)) > i) {
                q.a((Object) index, "index");
                i2 = index.intValue();
                irwVar = cellPlayable;
                i = a3;
            }
        }
        if (irwVar != null) {
            a(irwVar, i2);
            return;
        }
        NavigableMap<Integer, irw> mInScreenPlayable3 = this.c;
        q.a((Object) mInScreenPlayable3, "mInScreenPlayable");
        for (Map.Entry<Integer, irw> entry2 : mInScreenPlayable3.entrySet()) {
            Integer index2 = entry2.getKey();
            irw cellPlayable2 = entry2.getValue();
            q.a((Object) cellPlayable2, "cellPlayable");
            int f2 = cellPlayable2.f();
            int g2 = cellPlayable2.g();
            if (g2 - D >= (g2 - f2) * 0.5f && (a2 = a(D, E, f2, g2)) > i) {
                q.a((Object) index2, "index");
                irwVar = cellPlayable2;
                i2 = index2.intValue();
                i = a2;
            }
        }
        if (irwVar == null) {
            return;
        }
        a(irwVar, i2);
    }

    private final boolean a(NavigableMap<Integer, irw> navigableMap, iry iryVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93ac5d1a", new Object[]{this, navigableMap, iryVar})).booleanValue();
        }
        irw firstCell = navigableMap.firstEntry().getValue();
        Integer firstIndex = navigableMap.firstEntry().getKey();
        if (q.a(firstIndex.intValue(), 0) > 0) {
            return false;
        }
        q.a((Object) firstCell, "firstCell");
        int f = firstCell.f();
        int g = firstCell.g();
        if (g - iryVar.D() < (g - f) * b()) {
            return false;
        }
        q.a((Object) firstIndex, "firstIndex");
        a(firstCell, firstIndex.intValue());
        return true;
    }
}
