package com.taobao.taolive.uikit.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.message_open_api.api.data.topicsubscribe.rpc.SubScribeCenterResultDTO;
import com.taobao.message.subscribe.SubscribeUtils;
import tb.kge;
import tb.prc;
import tb.prl;

/* loaded from: classes8.dex */
public class TBLiveSubscribeView extends FrameLayout implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mActivityType;
    private boolean mBold;
    private int mBorderWidth;
    private JSONObject mClickMaidian;
    private float mCornerRadius;
    private String mLiveId;
    private JSONObject mLiveInfo;
    private b mResultCallback;
    private String mSubFrom;
    private int mSubscribeBgColor;
    private int mSubscribeBorderColor;
    private CharSequence mSubscribeText;
    private int mSubscribeTextColor;
    private int mTextGravity;
    private TextView mTextView;
    private int mUnSubscribeBgColor;
    private int mUnSubscribeBorderColor;
    private CharSequence mUnSubscribeText;
    private int mUnSubscribeTextColor;
    private boolean mUserSubscribed;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes8.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes8.dex */
    public interface b {
        void a();

        void b();
    }

    static {
        kge.a(1418634892);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(TBLiveSubscribeView tBLiveSubscribeView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ b access$000(TBLiveSubscribeView tBLiveSubscribeView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("226953c5", new Object[]{tBLiveSubscribeView}) : tBLiveSubscribeView.mResultCallback;
    }

    public static /* synthetic */ boolean access$102(TBLiveSubscribeView tBLiveSubscribeView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("637e40bd", new Object[]{tBLiveSubscribeView, new Boolean(z)})).booleanValue();
        }
        tBLiveSubscribeView.mUserSubscribed = z;
        return z;
    }

    public static /* synthetic */ JSONObject access$200(TBLiveSubscribeView tBLiveSubscribeView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("3eb34dfc", new Object[]{tBLiveSubscribeView}) : tBLiveSubscribeView.mLiveInfo;
    }

    public TBLiveSubscribeView(Context context) {
        super(context);
        this.mUserSubscribed = false;
        this.mSubFrom = "tblive_jingxuan";
        this.mActivityType = "taoLiveStartNotify";
    }

    public TBLiveSubscribeView(Context context, b bVar) {
        this(context, null, bVar);
    }

    public TBLiveSubscribeView(Context context, AttributeSet attributeSet, b bVar) {
        this(context, attributeSet, 0, bVar);
    }

    public TBLiveSubscribeView(Context context, AttributeSet attributeSet, int i, b bVar) {
        super(context, attributeSet, i);
        this.mUserSubscribed = false;
        this.mSubFrom = "tblive_jingxuan";
        this.mActivityType = "taoLiveStartNotify";
        this.mResultCallback = bVar;
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mTextView = new TextView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.mTextView, layoutParams);
        setOnClickListener(this);
    }

    public void render() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471a0b1d", new Object[]{this});
            return;
        }
        if (this.mUserSubscribed) {
            TextView textView = this.mTextView;
            if (textView != null) {
                textView.setText(this.mSubscribeText);
                this.mTextView.setTextColor(this.mSubscribeTextColor);
            }
            setBackground(this, createDrawable(this.mSubscribeBgColor, this.mSubscribeBorderColor, this.mBorderWidth, this.mCornerRadius));
        } else {
            TextView textView2 = this.mTextView;
            if (textView2 != null) {
                textView2.setText(this.mUnSubscribeText);
                this.mTextView.setTextColor(this.mUnSubscribeTextColor);
            }
            setBackground(this, createDrawable(this.mUnSubscribeBgColor, this.mUnSubscribeBorderColor, this.mBorderWidth, this.mCornerRadius));
        }
        this.mTextView.setGravity(this.mTextGravity);
        if (this.mBold) {
            this.mTextView.getPaint().setFakeBoldText(true);
        }
        this.mTextView.postInvalidate();
    }

    public void setUserSubscribed(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5cb9406", new Object[]{this, new Boolean(z)});
        } else {
            this.mUserSubscribed = z;
        }
    }

    public void setSubscribeText(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be4ce700", new Object[]{this, charSequence});
        } else {
            this.mSubscribeText = charSequence;
        }
    }

    public void setUnSubscribeText(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e480e7", new Object[]{this, charSequence});
        } else {
            this.mUnSubscribeText = charSequence;
        }
    }

    public void setSubscribeTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94ffb00e", new Object[]{this, new Integer(i)});
        } else {
            this.mSubscribeTextColor = i;
        }
    }

    public void setUnSubscribeTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36acc5b5", new Object[]{this, new Integer(i)});
        } else {
            this.mUnSubscribeTextColor = i;
        }
    }

    public void setSubscribeBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c5f4cf", new Object[]{this, new Integer(i)});
        } else {
            this.mSubscribeBgColor = i;
        }
    }

    public void setUnSubscribeBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3bff136", new Object[]{this, new Integer(i)});
        } else {
            this.mUnSubscribeBgColor = i;
        }
    }

    public void setSubscribeBorderColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e73bc24d", new Object[]{this, new Integer(i)});
        } else {
            this.mSubscribeBorderColor = i;
        }
    }

    public void setUnSubscribeBorderColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1fa0a34", new Object[]{this, new Integer(i)});
        } else {
            this.mUnSubscribeBorderColor = i;
        }
    }

    public void setBorderWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8120324", new Object[]{this, new Integer(i)});
        } else {
            this.mBorderWidth = i;
        }
    }

    public void setCornerRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c784f0", new Object[]{this, new Float(f)});
        } else {
            this.mCornerRadius = f;
        }
    }

    public void setTextSize(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5eecc9", new Object[]{this, new Float(f)});
            return;
        }
        TextView textView = this.mTextView;
        if (textView == null) {
            return;
        }
        textView.setTextSize(f);
    }

    public void setLiveId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("111acbfa", new Object[]{this, str});
        } else {
            this.mLiveId = str;
        }
    }

    public void setSubFrom(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32cec7d9", new Object[]{this, str});
        } else {
            this.mSubFrom = str;
        }
    }

    public void setActivityType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af04acbc", new Object[]{this, str});
        } else {
            this.mActivityType = str;
        }
    }

    public void setLiveInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf03c68d", new Object[]{this, jSONObject});
        } else {
            this.mLiveInfo = jSONObject;
        }
    }

    public void setClickMaidian(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d94e5ec8", new Object[]{this, jSONObject});
        } else {
            this.mClickMaidian = jSONObject;
        }
    }

    private void setBackground(View view, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("142cf15f", new Object[]{this, view, drawable});
        } else if (view == null || drawable == null) {
        } else {
            if (Build.VERSION.SDK_INT >= 16) {
                view.setBackground(drawable);
            } else {
                view.setBackgroundDrawable(drawable);
            }
        }
    }

    public boolean isBold() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("42a09bda", new Object[]{this})).booleanValue() : this.mBold;
    }

    public void setBold(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f78186", new Object[]{this, new Boolean(z)});
        } else {
            this.mBold = z;
        }
    }

    public int getTextGravity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a5324625", new Object[]{this})).intValue() : this.mTextGravity;
    }

    public void setTextGravity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a513881d", new Object[]{this, new Integer(i)});
        } else {
            this.mTextGravity = i;
        }
    }

    private Drawable createDrawable(int i, int i2, int i3, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("40d89abc", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Float(f)});
        }
        int a2 = prc.a(getContext(), f);
        try {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{i, i});
            gradientDrawable.setCornerRadius(a2);
            gradientDrawable.setStroke(i3, i2);
            return gradientDrawable;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (!(view instanceof TBLiveSubscribeView) || this.mLiveInfo == null) {
        } else {
            if (this.mUserSubscribed) {
                cancelSubscribe(view.getContext(), this.mLiveId, this.mSubFrom, this.mActivityType, new a() { // from class: com.taobao.taolive.uikit.view.TBLiveSubscribeView.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.taolive.uikit.view.TBLiveSubscribeView.a
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        if (TBLiveSubscribeView.access$000(TBLiveSubscribeView.this) != null) {
                            TBLiveSubscribeView.access$000(TBLiveSubscribeView.this).b();
                        }
                        TBLiveSubscribeView.access$102(TBLiveSubscribeView.this, false);
                        TBLiveSubscribeView.access$200(TBLiveSubscribeView.this).put("userSubscribe", (Object) "false");
                        TBLiveSubscribeView.this.render();
                    }
                });
            } else {
                subscribe(view.getContext(), this.mLiveId, this.mSubFrom, this.mActivityType, new a() { // from class: com.taobao.taolive.uikit.view.TBLiveSubscribeView.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.taolive.uikit.view.TBLiveSubscribeView.a
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        if (TBLiveSubscribeView.access$000(TBLiveSubscribeView.this) != null) {
                            TBLiveSubscribeView.access$000(TBLiveSubscribeView.this).a();
                        }
                        TBLiveSubscribeView.access$102(TBLiveSubscribeView.this, true);
                        TBLiveSubscribeView.access$200(TBLiveSubscribeView.this).put("userSubscribe", (Object) "true");
                        TBLiveSubscribeView.this.render();
                    }
                });
            }
            JSONObject jSONObject = this.mClickMaidian;
            if (jSONObject == null) {
                return;
            }
            String string = jSONObject.getString("name");
            StringBuilder sb = new StringBuilder();
            sb.append(this.mClickMaidian.getString("params"));
            sb.append(",userSubscribe=");
            sb.append(!this.mUserSubscribed);
            prl.a(string, sb.toString());
        }
    }

    private static void subscribe(Context context, String str, String str2, String str3, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e99898c3", new Object[]{context, str, str2, str3, aVar});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || StringUtils.isEmpty(str3)) {
        } else {
            SubscribeUtils.INSTANCE.doSubscribe(str, str3, null, str2, new IObserver<SubScribeCenterResultDTO>() { // from class: com.taobao.taolive.uikit.view.TBLiveSubscribeView.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.kit.core.IObserver
                public void onComplete() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                    }
                }

                @Override // com.taobao.message.kit.core.IObserver
                public void onError(Throwable th) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                    }
                }

                @Override // com.taobao.message.kit.core.IObserver
                public /* synthetic */ void onNext(SubScribeCenterResultDTO subScribeCenterResultDTO) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b4b8495", new Object[]{this, subScribeCenterResultDTO});
                    } else {
                        a(subScribeCenterResultDTO);
                    }
                }

                public void a(SubScribeCenterResultDTO subScribeCenterResultDTO) {
                    a aVar2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("962936cf", new Object[]{this, subScribeCenterResultDTO});
                        return;
                    }
                    String str4 = "subscribeLiveTopic onNext getRetCode = " + subScribeCenterResultDTO.getRetCode();
                    if (!"SUCCESS".equals(subScribeCenterResultDTO.getRetCode()) || (aVar2 = a.this) == null) {
                        return;
                    }
                    try {
                        aVar2.a();
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    private static void cancelSubscribe(Context context, String str, String str2, String str3, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd9cd69", new Object[]{context, str, str2, str3, aVar});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || StringUtils.isEmpty(str3)) {
        } else {
            SubscribeUtils.INSTANCE.cancelSubscribe(str, str3, null, str2, new IObserver<SubScribeCenterResultDTO>() { // from class: com.taobao.taolive.uikit.view.TBLiveSubscribeView.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.kit.core.IObserver
                public void onComplete() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                    }
                }

                @Override // com.taobao.message.kit.core.IObserver
                public void onError(Throwable th) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                    }
                }

                @Override // com.taobao.message.kit.core.IObserver
                public /* synthetic */ void onNext(SubScribeCenterResultDTO subScribeCenterResultDTO) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b4b8495", new Object[]{this, subScribeCenterResultDTO});
                    } else {
                        a(subScribeCenterResultDTO);
                    }
                }

                public void a(SubScribeCenterResultDTO subScribeCenterResultDTO) {
                    a aVar2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("962936cf", new Object[]{this, subScribeCenterResultDTO});
                        return;
                    }
                    String str4 = "cancelSubscribe onNext getRetCode = " + subScribeCenterResultDTO.getRetCode();
                    if (!"SUCCESS".equals(subScribeCenterResultDTO.getRetCode()) || (aVar2 = a.this) == null) {
                        return;
                    }
                    try {
                        aVar2.a();
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
