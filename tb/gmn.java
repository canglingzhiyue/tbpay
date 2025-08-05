package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.c;
import com.taobao.android.home.component.constructor.HGifViewConstructor;
import com.taobao.android.home.component.constructor.HImageViewConstructor;
import com.taobao.android.home.component.constructor.HVideoViewConstructor;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.home.component.utils.f;

/* loaded from: classes.dex */
public class gmn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1147056206);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            c.a().a("HImageView", new HImageViewConstructor());
        } catch (Exception e) {
            e.a("DinamicException", "registerView failed", e);
        }
        try {
            c.a().a("HGifView", new HGifViewConstructor());
        } catch (Exception e2) {
            e.a("DinamicException", "registerView failed", e2);
        }
        try {
            c.a().a("HVideoView", new HVideoViewConstructor());
        } catch (Exception e3) {
            e.a("DinamicException", "registerView failed", e3);
        }
        try {
            c.a().a(kvg.TAG, new gmo());
        } catch (Exception e4) {
            e.a("DinamicException", "registerView failed", e4);
        }
        try {
            c.a().a("festival", new gms());
        } catch (Exception e5) {
            e.a("DinamicException", "registerParser failed", e5);
        }
        try {
            c.a().a(boa.TAG, new gmt());
        } catch (Exception e6) {
            e.a("DinamicException", "registerParser failed", e6);
        }
        try {
            c.a();
            new f();
        } catch (Exception e7) {
            e.a("DinamicException", "registerView failed", e7);
        }
    }
}
