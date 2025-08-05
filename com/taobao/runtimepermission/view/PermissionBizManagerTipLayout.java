package com.taobao.runtimepermission.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.nmk;
import tb.tfr;

/* loaded from: classes7.dex */
public class PermissionBizManagerTipLayout extends FrameLayout implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EVENT_BACK_2_PERMISSION_REQ = 10003;
    private static final String TAG = "PermissionBizTip";
    private nmk mEventListener;

    public static /* synthetic */ Object ipc$super(PermissionBizManagerTipLayout permissionBizManagerTipLayout, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public PermissionBizManagerTipLayout(Context context) {
        this(context, null);
    }

    public PermissionBizManagerTipLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PermissionBizManagerTipLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.layout_biz_permission_manage_tip, this);
        ((ImageView) findViewById(R.id.go_back)).setOnClickListener(this);
        ((TextView) findViewById(R.id.manager_permission_title_text)).setText(b.a(R.string.taobao_app_1040_1_23516));
        ((TextView) findViewById(R.id.manager_permission_explain_text)).setText(b.a(R.string.taobao_app_1040_1_23517));
    }

    public void setEventListener(nmk nmkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b161d417", new Object[]{this, nmkVar});
        } else {
            this.mEventListener = nmkVar;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int id = view.getId();
        if (id == R.id.go_back) {
            onEvent(10003);
            return;
        }
        tfr.b(TAG, "onClick: handle with unknown view id " + id);
    }

    private void onEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
            return;
        }
        nmk nmkVar = this.mEventListener;
        if (nmkVar == null) {
            tfr.b(TAG, "onEvent: event listener is empty, is right?");
        } else {
            nmkVar.onEvent(i);
        }
    }
}
