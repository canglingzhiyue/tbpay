package tb;

import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.xmk;

/* loaded from: classes6.dex */
public class xmj extends xmk.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int b;

    static {
        kge.a(1293876747);
    }

    public static /* synthetic */ Object ipc$super(xmj xmjVar, String str, Object... objArr) {
        if (str.hashCode() == 90991720) {
            super.a();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public xmj(ViewGroup viewGroup) {
        super(viewGroup, 3000);
        String V = hir.V();
        if (V == null) {
            return;
        }
        JSONObject b = pqj.b(V);
        if (V == null) {
            return;
        }
        String string = b.getString("tieleText");
        String string2 = b.getString("leftIconImageViewUrl");
        String string3 = b.getString("rightArrowImageViewUrl");
        this.b = l.a(b.getString(StEvent.SHOW_TIME), 0);
        View findViewById = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.taolive_gl_toast_expand_rp, (ViewGroup) null).findViewById(R.id.taolive_good_toast_root);
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById.findViewById(R.id.taolive_gl_expand_rp_left_icon);
        if (!StringUtils.isEmpty(string2)) {
            tUrlImageView.setImageUrl(string2);
        }
        TUrlImageView tUrlImageView2 = (TUrlImageView) findViewById.findViewById(R.id.taolive_gl_expand_rp_right_icon);
        if (!StringUtils.isEmpty(string3)) {
            tUrlImageView2.setImageUrl(string3);
        }
        ((TextView) findViewById.findViewById(R.id.taolive_gl_expand_rp_text)).setText(string);
        a(findViewById);
        b(hin.a(this.f34370a, 42.0f));
        a(this.b * 1000);
    }

    @Override // tb.xmk.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        his.b("ExpandRPToast", "show | mShowTime=" + this.b);
        if (this.b <= 0) {
            return;
        }
        super.a();
    }
}
