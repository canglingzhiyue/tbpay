package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.preference.PreferenceManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.animate.b;
import com.taobao.phenix.animate.c;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.phenix.intf.event.a;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* loaded from: classes4.dex */
public class lpf implements a<SuccPhenixEvent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TUrlImageView f30794a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ lpe c;

    public lpf(lpe lpeVar, TUrlImageView tUrlImageView, Context context) {
        this.c = lpeVar;
        this.f30794a = tUrlImageView;
        this.b = context;
    }

    @Override // com.taobao.phenix.intf.event.a
    public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
    }

    public boolean a(SuccPhenixEvent succPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
        }
        if (succPhenixEvent.getDrawable() != null && !succPhenixEvent.isIntermediate()) {
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            if (drawable instanceof b) {
                ((b) drawable).a(new c() { // from class: tb.lpf.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.phenix.animate.c
                    public boolean onLoopCompleted(int i, int i2) {
                        IpChange ipChange2 = $ipChange;
                        boolean z = false;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("a7565d93", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
                        }
                        if (i == 0) {
                            z = true;
                        }
                        if (!z) {
                            lpf.this.f30794a.setVisibility(8);
                            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(lpf.this.b).edit();
                            edit.putBoolean("hasPlayedStoreFlower", true);
                            edit.apply();
                        }
                        return z;
                    }
                });
            }
        }
        return true;
    }
}
