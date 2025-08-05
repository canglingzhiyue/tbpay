package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public class fyi implements fyb<fym> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_MAX_PLAYING_VIDEO = 1;

    /* renamed from: a  reason: collision with root package name */
    private final int f28215a;
    private final Set<Integer> b;

    static {
        kge.a(341030446);
        kge.a(1432639968);
    }

    public fyi() {
        this.b = new HashSet();
        this.f28215a = 1;
    }

    public fyi(int i) {
        this.b = new HashSet();
        this.f28215a = i;
    }

    @Override // tb.fyb
    public boolean a(fym fymVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e97ee6a2", new Object[]{this, fymVar})).booleanValue() : this.b.contains(Integer.valueOf(fymVar.hashCode()));
    }

    @Override // tb.fyb
    public void a(fxy<?, fym> fxyVar, fym fymVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("995aad1", new Object[]{this, fxyVar, fymVar, str});
        } else if (this.b.contains(Integer.valueOf(fymVar.hashCode())) || this.b.size() >= this.f28215a) {
        } else {
            this.b.add(Integer.valueOf(fymVar.hashCode()));
            if (DinamicXEngine.j()) {
                fuw.d("DXVideoController", "notifyVideoPlay: " + fymVar);
            }
            fymVar.onCanPlay(fxyVar, str);
        }
    }

    @Override // tb.fyb
    public void b(fxy<?, fym> fxyVar, fym fymVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d296a212", new Object[]{this, fxyVar, fymVar, str});
        } else if (!this.b.contains(Integer.valueOf(fymVar.hashCode()))) {
        } else {
            b(fymVar);
            if (DinamicXEngine.j()) {
                fuw.d("DXVideoController", "notifyVideoStop: " + fymVar);
            }
            fymVar.onShouldStop(fxyVar, str);
        }
    }

    @Override // tb.fyb
    public void b(fym fymVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d801ed1f", new Object[]{this, fymVar});
        } else {
            this.b.remove(Integer.valueOf(fymVar.hashCode()));
        }
    }

    @Override // tb.fyb
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : Math.max(0, this.f28215a - this.b.size());
    }
}
