package tb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.publishinsert.IPublishInsertService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* loaded from: classes5.dex */
public class ptd extends pta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View c;
    private TUrlImageView d;
    private TextView e;

    static {
        kge.a(-526537174);
    }

    public static /* synthetic */ Object ipc$super(ptd ptdVar, String str, Object... objArr) {
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1e3f2f83", new Object[]{this}) : "ErrorLayer";
    }

    public ptd(FluidContext fluidContext, psw pswVar) {
        super(fluidContext, pswVar);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        View view = this.c;
        if (view == null || view.getParent() == null) {
            return;
        }
        ((ViewGroup) this.b.B()).removeView(this.c);
    }

    @Override // tb.pta, tb.shm
    public void onCreateView(psw pswVar, snp snpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af379f7e", new Object[]{this, pswVar, snpVar});
        } else {
            super.onCreateView(pswVar, snpVar);
        }
    }

    @Override // tb.pta, tb.shm
    public void onBindData(psw pswVar, a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e0be620", new Object[]{this, pswVar, aVar, new Integer(i)});
            return;
        }
        super.onBindData(pswVar, aVar, i);
        a.c a2 = aVar.a();
        if (a2 != null && a2.w()) {
            c();
        } else {
            a(a2.l());
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.b.B() == null || ((IPublishInsertService) this.f32873a.getService(IPublishInsertService.class)).isPublishIInsertEnable() || !(this.b.B() instanceof ViewGroup)) {
        } else {
            ViewGroup viewGroup = (ViewGroup) this.b.B();
            if (this.c == null) {
                this.c = LayoutInflater.from(this.b.B().getContext()).inflate(R.layout.fluid_sdk_content_error, (ViewGroup) this.b.B(), false);
                this.d = (TUrlImageView) this.c.findViewById(R.id.imv_content_error);
                this.e = (TextView) this.c.findViewById(R.id.txtv_error_msg);
            }
            if (sjv.a()) {
                spz.c("ErrorLayer", "NewContentErrorStatus 异常内容，展示下发文案/icon");
                String str = "";
                this.d.setImageUrl(this.b.D() != null ? this.b.D().n() : str);
                TextView textView = this.e;
                if (this.b.D() != null) {
                    str = this.b.D().m();
                }
                textView.setText(str);
            } else {
                this.d.setImageUrl("https://img.alicdn.com/tfs/TB1xdTfRhD1gK0jSZFsXXbldVXa-636-636.png");
                this.e.setText(sls.a(i));
            }
            if (this.c.getParent() != null) {
                return;
            }
            viewGroup.addView(this.c, new ViewGroup.LayoutParams(-1, -1));
        }
    }
}
