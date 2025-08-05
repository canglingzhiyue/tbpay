package tb;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.core.protocol.DWInteractiveVideoObject;
import com.taobao.avplayer.core.protocol.DWTimelineObject;
import com.taobao.avplayer.playercontrol.widget.NavSeekBar;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* loaded from: classes6.dex */
public class kca implements kcd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DWContext f29955a;
    private DWInteractiveVideoObject b;
    private kcc c;
    private NavSeekBar d;
    private int e;
    private boolean f = true;
    private AtomicBoolean g;

    static {
        kge.a(811646122);
        kge.a(1212562064);
        kge.a(-366035241);
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : "1";
    }

    public kca(DWContext dWContext, View view) {
        this.f29955a = dWContext;
        DWContext dWContext2 = this.f29955a;
        if (dWContext2 == null || dWContext2.getVideo() == null) {
            return;
        }
        if (view != null && (view instanceof NavSeekBar)) {
            this.d = (NavSeekBar) view;
            this.d.setNavSeekBarCallback(this);
        }
        this.g = new AtomicBoolean(false);
    }

    public void a(DWInteractiveVideoObject dWInteractiveVideoObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79529c5f", new Object[]{this, dWInteractiveVideoObject});
        } else {
            this.b = dWInteractiveVideoObject;
        }
    }

    private void d() {
        JSONArray interactive;
        Drawable a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        DWInteractiveVideoObject dWInteractiveVideoObject = this.b;
        if (dWInteractiveVideoObject == null || this.d == null || (interactive = dWInteractiveVideoObject.getInteractive(c())) == null) {
            return;
        }
        int length = interactive.length();
        if (length > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < length; i++) {
                DWTimelineObject dWTimelineObject = new DWTimelineObject(interactive.optJSONObject(i));
                int startTime = dWTimelineObject.getStartTime();
                String source = dWTimelineObject.getSource();
                if (!TextUtils.isEmpty(source) && startTime >= 0 && this.e > 0 && (a2 = kbz.a(source, this.f29955a.getActivity())) != null) {
                    int i2 = this.e;
                    if (startTime >= i2) {
                        startTime = i2;
                    }
                    arrayList.add(new kcb(startTime / this.e, source, a2));
                }
            }
            this.c = new kby(arrayList);
            this.d.setAdapter(this.c);
        }
        this.g.compareAndSet(false, true);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f = true;
        NavSeekBar navSeekBar = this.d;
        if (navSeekBar != null) {
            navSeekBar.setNavVisible(this.f);
        }
        if (this.g.get() || this.e <= 0) {
            return;
        }
        d();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f = false;
        NavSeekBar navSeekBar = this.d;
        if (navSeekBar == null) {
            return;
        }
        navSeekBar.setNavVisible(this.f);
    }

    @Override // tb.kcd
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        DWContext dWContext = this.f29955a;
        if (dWContext == null || dWContext.getVideo() == null || !this.f29955a.isShowInteractive()) {
            return;
        }
        int i = this.e;
        if (i != 0 && i != this.f29955a.getVideo().n()) {
            this.g.compareAndSet(true, false);
        }
        this.e = this.f29955a.getVideo().n();
        if (this.g.get() || this.e <= 0) {
            return;
        }
        d();
    }
}
