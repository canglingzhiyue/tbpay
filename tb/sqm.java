package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class sqm extends nle {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2140539994);
    }

    @Override // tb.nle, tb.nlf
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.nlf
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.nlf
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.nlf
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public sqm(Context context, hka hkaVar, String str) {
        super(context, hkaVar, str);
    }
}
