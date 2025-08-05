package tb;

import android.content.Context;
import android.view.SurfaceHolder;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class rri extends rrh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static rri f;

    static {
        kge.a(-331111622);
    }

    public static /* synthetic */ Object ipc$super(rri rriVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 90991720) {
            super.a();
            return null;
        } else if (hashCode != 99303409) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.j();
            return null;
        }
    }

    public rri(Context context) {
        super(context);
    }

    @Override // tb.rrm
    public void a(SurfaceHolder surfaceHolder, float f2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1aabb938", new Object[]{this, surfaceHolder, new Float(f2), new Integer(i), new Integer(i2)});
            return;
        }
        BioLog.d("startPreview...");
        if (this.e || this.f33331a == null) {
            return;
        }
        try {
            this.f33331a.setPreviewDisplay(surfaceHolder);
            this.f33331a.startPreview();
            this.e = true;
        } catch (Exception e) {
            BioLog.e(e.toString());
            if (this.b == null) {
                return;
            }
            this.b.onError(-1);
        }
    }

    @Override // tb.rrh
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        super.j();
        this.f33331a.setDisplayOrientation(this.c);
    }

    @Override // tb.rrh, tb.rrm
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        f = null;
    }
}
