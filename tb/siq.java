package tb;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.common.view.FscrmidFavorFrameLayout;
import com.taobao.android.fluid.common.view.VideoRoundCornerLayout;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class siq extends pta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final sii c;
    private ViewGroup d;
    private VideoRoundCornerLayout e;

    static {
        kge.a(-1350639402);
    }

    public static /* synthetic */ Object ipc$super(siq siqVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1355309186) {
            super.onCreateView((psw) objArr[0], (snp) objArr[1]);
            return null;
        } else if (hashCode != 504096288) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onBindData((psw) objArr[0], (a) objArr[1], ((Number) objArr[2]).intValue());
            return null;
        }
    }

    @Override // tb.ptc
    public String cL_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1e3f2f83", new Object[]{this}) : "RootLayer";
    }

    public static /* synthetic */ sii a(siq siqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sii) ipChange.ipc$dispatch("ba0956", new Object[]{siqVar}) : siqVar.c;
    }

    public siq(FluidContext fluidContext, sii siiVar) {
        super(fluidContext, siiVar);
        this.c = siiVar;
    }

    public VideoRoundCornerLayout c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoRoundCornerLayout) ipChange.ipc$dispatch("1321b6b", new Object[]{this}) : this.e;
    }

    public ViewGroup d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("5ee44eca", new Object[]{this}) : this.d;
    }

    @Override // tb.pta, tb.shm
    public void onCreateView(psw pswVar, snp snpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af379f7e", new Object[]{this, pswVar, snpVar});
            return;
        }
        super.onCreateView(pswVar, snpVar);
        this.d = (FrameLayout) this.c.B();
        this.e = (VideoRoundCornerLayout) this.d.findViewById(R.id.video_host);
        String str = ((IDataService) this.c.z().getService(IDataService.class)).getConfig().j().B;
        if (StringUtils.isEmpty(str)) {
            return;
        }
        FluidSDK.getImageAdapter().load(str, new com.taobao.android.fluid.framework.adapter.mtop.a<String, BitmapDrawable>() { // from class: tb.siq.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.fluid.framework.adapter.mtop.a
            public void a(String str2, BitmapDrawable bitmapDrawable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cc1cd0a7", new Object[]{this, str2, bitmapDrawable});
                    return;
                }
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (bitmap == null) {
                    return;
                }
                ((FscrmidFavorFrameLayout) siq.a(siq.this).G().itemView).setBitmap(bitmap);
            }
        });
    }

    @Override // tb.pta, tb.shm
    public void onBindData(psw pswVar, a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e0be620", new Object[]{this, pswVar, aVar, new Integer(i)});
            return;
        }
        super.onBindData(pswVar, aVar, i);
        if (!(this.c.B() instanceof FscrmidFavorFrameLayout)) {
            return;
        }
        ((FscrmidFavorFrameLayout) this.c.B()).setContentValid(this.c.J());
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.c.ah().b() == null) {
        } else {
            this.e.setPadding(0, 0, 0, this.c.ah().b().f);
        }
    }

    public void a(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b3caa", new Object[]{this, view, new Boolean(z)});
        } else if (!z) {
        } else {
            this.e.removeView(view);
        }
    }
}
