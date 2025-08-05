package com.flybird;

import android.content.Context;
import android.widget.Button;
import com.alipay.birdnest.platform.Platform;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;

/* loaded from: classes4.dex */
public class FBButton extends FBLabel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String[] M;
    public Button N;

    public FBButton(Context context, FBDocument fBDocument) {
        super(context, new FBBorderButton(context), fBDocument);
        this.M = new String[3];
        Button button = (Button) getInnerView();
        this.N = button;
        button.setGravity(17);
        this.N.setBackgroundDrawable(null);
    }

    public static /* synthetic */ Object ipc$super(FBButton fBButton, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1022301035) {
            super.updateCSS((String) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode != 1852014070) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.doDestroy();
            return null;
        }
    }

    @Override // com.flybird.FBLabel
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.flybird.FBLabel, com.flybird.FBView
    public void doDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e637df6", new Object[]{this});
            return;
        }
        super.doDestroy();
        this.M = null;
        this.N = null;
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        String[] strArr = this.M;
        if (strArr[1] == null && strArr[2] == null) {
            this.N.setTextColor(FBTools.parseColor(strArr[0], FBDocumentAssistor.c(this.mDoc), FBDocumentAssistor.b(this.mDoc), this.themeModeUseColorMapping));
        } else {
            this.N.setTextColor(FBTools.genTextSelector(strArr, FBDocumentAssistor.c(this.mDoc), FBDocumentAssistor.b(this.mDoc), this.themeModeUseColorMapping));
        }
    }

    @Override // com.flybird.FBLabel, com.flybird.FBView
    public void updateCSS(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c310ec95", new Object[]{this, str, str2});
        } else if (str == null || isDestroyed()) {
        } else {
            char c = 65535;
            switch (str.hashCode()) {
                case -1586082113:
                    if (str.equals(a.ATOM_EXT_UDL_font_size)) {
                        c = 0;
                        break;
                    }
                    break;
                case -886884611:
                    if (str.equals("color:active")) {
                        c = 1;
                        break;
                    }
                    break;
                case 34328755:
                    if (str.equals("color:disabled")) {
                        c = 2;
                        break;
                    }
                    break;
                case 94842723:
                    if (str.equals("color")) {
                        c = 3;
                        break;
                    }
                    break;
                case 598800822:
                    if (str.equals(a.ATOM_EXT_UDL_font_weight)) {
                        c = 4;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                this.N.setTextSize(Platform.f, FBView.parseFontSize(str2));
            } else if (c == 1) {
                putThemeModeAssociatedActions(FBView.THEME_ASSOCIATED_TYPE_CSS, str, str2);
                this.M[1] = str2;
                g();
            } else if (c == 2) {
                this.M[2] = str2;
                g();
            } else if (c == 3) {
                putThemeModeAssociatedActions(FBView.THEME_ASSOCIATED_TYPE_CSS, str, str2);
                this.M[0] = str2;
                g();
            } else if (c != 4) {
                super.updateCSS(str, str2);
            } else {
                this.N.getPaint().setFakeBoldText("bold".equals(str2));
            }
        }
    }
}
