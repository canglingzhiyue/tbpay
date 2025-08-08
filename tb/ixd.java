package tb;

import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.error.Error;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.ErrorConstant;

/* loaded from: classes6.dex */
public class ixd extends ixc<CustomBaseActivity> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ViewGroup b;
    private TBErrorView c;

    static {
        kge.a(512701335);
    }

    public static /* synthetic */ Object ipc$super(ixd ixdVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ixd(CustomBaseActivity customBaseActivity, ViewGroup viewGroup) {
        super(customBaseActivity);
        this.b = viewGroup;
    }

    @Override // tb.ixc
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.c = (TBErrorView) this.b.findViewById(R.id.error);
        if (this.c != null) {
            return;
        }
        LayoutInflater.from(this.f29391a).inflate(R.layout.shop_error_view, this.b);
        this.c = (TBErrorView) this.b.findViewById(R.id.error);
    }

    public void a(MtopResponse mtopResponse, String str, String str2, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42120fd8", new Object[]{this, mtopResponse, str, str2, onClickListener});
            return;
        }
        if (mtopResponse != null) {
            String retCode = mtopResponse.getRetCode();
            if (StringUtils.equals("ERROR_SHOP", retCode) || StringUtils.equals("ERROR_STATUS", retCode) || StringUtils.equals("ERROR_PARAMS", retCode)) {
                this.c.setTitle(ErrorConstant.MappingMsg.SERVICE_MAPPING_MSG);
                this.c.setSubTitle("别紧张，试试看刷新页面");
            } else {
                this.c.setTitle(mtopResponse.getRetMsg());
                this.c.setSubTitle(mtopResponse.getRetCode());
            }
            this.c.setError(Error.Factory.fromMtopResponse(mtopResponse.getResponseCode(), mtopResponse.getMappingCode(), mtopResponse.getRetCode(), mtopResponse.getRetMsg()));
        } else {
            this.c.setTitle(str2);
            this.c.setSubTitle(str);
            this.c.setError(Error.Factory.newError(str, str2));
        }
        this.c.setButton(TBErrorView.ButtonType.BUTTON_LEFT, a(R.string.shop_error_reload_text), onClickListener);
        d();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.c.setVisibility(8);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.c.setVisibility(0);
        }
    }

    private String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)}) : this.f29391a.getResources().getString(i);
    }
}
