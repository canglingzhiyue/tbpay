package com.taobao.runtimepermission.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
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
public class PermissionBizReqLayout extends FrameLayout implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_HEIGHT_DP_FOR_BUTTON = 36;
    public static final int EVENT_BIZ_PERMISSION_DENIED = -1;
    public static final int EVENT_BIZ_PERMISSION_GRANTED = 0;
    public static final int EVENT_SHOW_BIZ_PERMISSION_MANAGE_INFO = 10001;
    private static final String TAG = "PermissionBizReqView";
    private Button mDeniedBtn;
    private nmk mEventListener;
    private Button mGrantedBtn;
    private TextView mRationalText;
    private TextView mRationalTitleText;
    private ImageView mReqTypeImg;

    public static /* synthetic */ Object ipc$super(PermissionBizReqLayout permissionBizReqLayout, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public PermissionBizReqLayout(Context context) {
        this(context, null);
    }

    public PermissionBizReqLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PermissionBizReqLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.layout_biz_permission_request, this);
        this.mReqTypeImg = (ImageView) findViewById(R.id.biz_permission_icon_img);
        this.mRationalTitleText = (TextView) findViewById(R.id.biz_request_title);
        this.mRationalText = (TextView) findViewById(R.id.biz_permission_explain_text);
        this.mGrantedBtn = (Button) findViewById(R.id.biz_permission_grant_btn);
        this.mDeniedBtn = (Button) findViewById(R.id.biz_permission_deny_btn);
        TextView textView = (TextView) findViewById(R.id.how_to_manage_permission_text);
        this.mGrantedBtn.setOnClickListener(this);
        this.mDeniedBtn.setOnClickListener(this);
        textView.setOnClickListener(this);
        this.mRationalTitleText.setText(b.a(R.string.default_title));
        this.mRationalText.setText(b.a(R.string.default_reason));
        textView.setText(b.a(R.string.taobao_app_1040_1_23515));
        this.mGrantedBtn.setText(b.a(R.string.title_provision_agree));
        this.mDeniedBtn.setText(b.a(R.string.title_provision_discard));
    }

    public void setRationalText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8d507ce", new Object[]{this, str});
        } else {
            this.mRationalText.setText(str);
        }
    }

    public void setRationalTitleText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8789baa6", new Object[]{this, str});
        } else {
            this.mRationalTitleText.setText(str);
        }
    }

    public void setReqPermissionIconImg(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("952c2c7d", new Object[]{this, new Integer(i)});
        } else {
            this.mReqTypeImg.setImageResource(i);
        }
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
        if (id == R.id.biz_permission_grant_btn) {
            onEvent(0);
        } else if (id == R.id.biz_permission_deny_btn) {
            onEvent(-1);
        } else if (id == R.id.how_to_manage_permission_text) {
            onEvent(10001);
        } else {
            tfr.b(TAG, "onClick: handle with unknown view id " + id);
        }
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

    public void showWithAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fd8cd68", new Object[]{this});
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(350L);
        startAnimation(translateAnimation);
        setVisibility(0);
    }

    public void autoSizeBottomButtonIfNeeded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bd2cb06", new Object[]{this});
            return;
        }
        int height = this.mGrantedBtn.getHeight();
        int dpToPx = dpToPx(36, getContext());
        int i = height - dpToPx;
        if (i >= 0) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mGrantedBtn.getLayoutParams();
        int max = Math.max(marginLayoutParams.topMargin + i, 0);
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, max, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        this.mGrantedBtn.setLayoutParams(marginLayoutParams);
        this.mGrantedBtn.setHeight(dpToPx);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.mDeniedBtn.getLayoutParams();
        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, max, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
        this.mDeniedBtn.setLayoutParams(marginLayoutParams2);
        this.mDeniedBtn.setHeight(dpToPx);
    }

    private static int dpToPx(int i, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f178682e", new Object[]{new Integer(i), context})).intValue() : Math.round(i * context.getResources().getDisplayMetrics().density);
    }
}
