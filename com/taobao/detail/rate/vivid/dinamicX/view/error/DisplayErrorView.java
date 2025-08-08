package com.taobao.detail.rate.vivid.dinamicX.view.error;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.error.Error;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.arz;
import tb.mxf;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001=B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010;\u001a\u00020<R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001c\u0010!\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\u001c\u0010$\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR\u001c\u0010'\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u000eR\u001c\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00100\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\f\"\u0004\b2\u0010\u000eR\u001c\u00103\u001a\u0004\u0018\u000104X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0010\u00109\u001a\u0004\u0018\u00010:X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/taobao/detail/rate/vivid/dinamicX/view/error/DisplayErrorView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "apiName", "", "getApiName", "()Ljava/lang/String;", "setApiName", "(Ljava/lang/String;)V", "buttonListener", "Lcom/taobao/detail/rate/vivid/dinamicX/view/error/DisplayErrorView$TBErrorButtonBack;", "getButtonListener", "()Lcom/taobao/detail/rate/vivid/dinamicX/view/error/DisplayErrorView$TBErrorButtonBack;", "setButtonListener", "(Lcom/taobao/detail/rate/vivid/dinamicX/view/error/DisplayErrorView$TBErrorButtonBack;)V", "buttonTitle", "getButtonTitle", "setButtonTitle", "errorMsg", "getErrorMsg", "setErrorMsg", "iconUrl", "getIconUrl", "setIconUrl", arz.KEY_MAPPING_CODE, "getMappingCode", "setMappingCode", ZimMessageChannel.K_RPC_RES_CODE, "getResponseCode", "setResponseCode", "retCode", "getRetCode", "setRetCode", MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE, "getSubTitle", "setSubTitle", "tbErrorView", "Lcom/taobao/uikit/extend/component/TBErrorView;", "getTbErrorView", "()Lcom/taobao/uikit/extend/component/TBErrorView;", "setTbErrorView", "(Lcom/taobao/uikit/extend/component/TBErrorView;)V", "title", "getTitle", "setTitle", "userMtopInfo", "Lcom/alibaba/fastjson/JSONObject;", "getUserMtopInfo", "()Lcom/alibaba/fastjson/JSONObject;", "setUserMtopInfo", "(Lcom/alibaba/fastjson/JSONObject;)V", "viewExtend", "Landroid/view/View;", mxf.initView, "", "TBErrorButtonBack", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class DisplayErrorView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String apiName;
    private a buttonListener;
    private String buttonTitle;
    private String errorMsg;
    private String iconUrl;
    private String mappingCode;
    private String responseCode;
    private String retCode;
    private String subTitle;
    private TBErrorView tbErrorView;
    private String title;
    private JSONObject userMtopInfo;
    private View viewExtend;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/taobao/detail/rate/vivid/dinamicX/view/error/DisplayErrorView$TBErrorButtonBack;", "", "onButtonClick", "", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public interface a {
        void a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/taobao/detail/rate/vivid/dinamicX/view/error/DisplayErrorView$initView$1$2"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            a buttonListener = DisplayErrorView.this.getButtonListener();
            if (buttonListener == null) {
                return;
            }
            buttonListener.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        q.d(context, "context");
        this.viewExtend = LayoutInflater.from(context).inflate(R.layout.layout_rate_error_view, (ViewGroup) this, false);
        View view = this.viewExtend;
        View findViewById = view != null ? view.findViewById(R.id.tb_rate_error_view) : null;
        if (findViewById != null) {
            this.tbErrorView = (TBErrorView) findViewById;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.uikit.extend.component.TBErrorView");
    }

    public /* synthetic */ DisplayErrorView(Context context, AttributeSet attributeSet, int i, int i2, o oVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final String getApiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this}) : this.apiName;
    }

    public final void setApiName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26589b54", new Object[]{this, str});
        } else {
            this.apiName = str;
        }
    }

    public final String getButtonTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5c0977e9", new Object[]{this}) : this.buttonTitle;
    }

    public final void setButtonTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cdcb415", new Object[]{this, str});
        } else {
            this.buttonTitle = str;
        }
    }

    public final String getErrorMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this}) : this.errorMsg;
    }

    public final void setErrorMsg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e298332c", new Object[]{this, str});
        } else {
            this.errorMsg = str;
        }
    }

    public final String getIconUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43d20f9", new Object[]{this}) : this.iconUrl;
    }

    public final void setIconUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a6a8705", new Object[]{this, str});
        } else {
            this.iconUrl = str;
        }
    }

    public final String getMappingCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8d754d74", new Object[]{this}) : this.mappingCode;
    }

    public final void setMappingCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38eb8fea", new Object[]{this, str});
        } else {
            this.mappingCode = str;
        }
    }

    public final String getResponseCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("45f50135", new Object[]{this}) : this.responseCode;
    }

    public final void setResponseCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94999e1", new Object[]{this, str});
        } else {
            this.responseCode = str;
        }
    }

    public final String getRetCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f243c01", new Object[]{this}) : this.retCode;
    }

    public final void setRetCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c66ccfd", new Object[]{this, str});
        } else {
            this.retCode = str;
        }
    }

    public final String getSubTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d9c4664b", new Object[]{this}) : this.subTitle;
    }

    public final void setSubTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9a5bd8b", new Object[]{this, str});
        } else {
            this.subTitle = str;
        }
    }

    public final String getTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this}) : this.title;
    }

    public final void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.title = str;
        }
    }

    public final JSONObject getUserMtopInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b8bce1e", new Object[]{this}) : this.userMtopInfo;
    }

    public final void setUserMtopInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2cb426", new Object[]{this, jSONObject});
        } else {
            this.userMtopInfo = jSONObject;
        }
    }

    public final TBErrorView getTbErrorView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBErrorView) ipChange.ipc$dispatch("7bcc3229", new Object[]{this}) : this.tbErrorView;
    }

    public final void setTbErrorView(TBErrorView tBErrorView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7c536e5", new Object[]{this, tBErrorView});
        } else {
            this.tbErrorView = tBErrorView;
        }
    }

    public final a getButtonListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("567ae38c", new Object[]{this}) : this.buttonListener;
    }

    public final void setButtonListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39d5bd6a", new Object[]{this, aVar});
        } else {
            this.buttonListener = aVar;
        }
    }

    public final void initView() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        removeAllViews();
        TBErrorView tBErrorView = this.tbErrorView;
        if (tBErrorView != null) {
            tBErrorView.setIconUrl(this.iconUrl);
            tBErrorView.setTitle(this.title);
            tBErrorView.setSubTitle(this.subTitle);
            JSONObject jSONObject = this.userMtopInfo;
            if (jSONObject != null) {
                this.mappingCode = jSONObject.getString(arz.KEY_MAPPING_CODE);
                this.responseCode = jSONObject.getString(ZimMessageChannel.K_RPC_RES_CODE);
                this.retCode = jSONObject.getString("retCode");
                this.errorMsg = jSONObject.getString("errorMsg");
            }
            String str = this.apiName;
            String str2 = this.responseCode;
            if (str2 != null) {
                i = Integer.parseInt(str2);
            }
            tBErrorView.setError(Error.Factory.fromMtopResponse(str, i, this.mappingCode, this.retCode, this.errorMsg));
            if (!StringUtils.isEmpty(this.buttonTitle)) {
                tBErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, this.buttonTitle, new b());
            }
        }
        addView(this.viewExtend);
    }
}
