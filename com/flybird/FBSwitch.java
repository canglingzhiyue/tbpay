package com.flybird;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class FBSwitch extends FBView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public CheckBox A;

    public FBSwitch(Context context, View view, FBDocument fBDocument) {
        super(context, view, fBDocument);
        this.A = (CheckBox) getInnerView();
    }

    public static /* synthetic */ Object ipc$super(FBSwitch fBSwitch, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1807346616) {
            super.updateFunc((String) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode == 663633004) {
            super.updateEvent((String) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode != 1244158581) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.updateAttr((String) objArr[0], (String) objArr[1]);
            return null;
        }
    }

    @Override // com.flybird.FBView
    public void updateAttr(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a285a75", new Object[]{this, str, str2});
            return;
        }
        super.updateAttr(str, str2);
        if (!"value".equals(str)) {
            return;
        }
        if ("on".equals(str2)) {
            this.A.setChecked(true);
        } else if (!"off".equals(str2)) {
        } else {
            this.A.setChecked(false);
        }
    }

    @Override // com.flybird.FBView
    public void updateEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("278e3c6c", new Object[]{this, str, str2});
            return;
        }
        super.updateEvent(str, str2);
        if (!str2.equals("onchange")) {
            return;
        }
        this.A.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.flybird.FBSwitch.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton, new Boolean(z)});
                } else {
                    FBView.nativePlatformInvokeCallback(FBSwitch.this.mNode, "onchange", z ? "on" : "off");
                }
            }
        });
    }

    @Override // com.flybird.FBView
    public void updateFunc(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94461448", new Object[]{this, str, str2});
        } else {
            super.updateFunc(str, str2);
        }
    }
}
