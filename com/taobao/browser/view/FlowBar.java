package com.taobao.browser.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.taobao.R;
import java.io.ByteArrayInputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class FlowBar extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mCtx;
    private FlowBarItem mCurrentItem;
    private int mPosition;

    static {
        kge.a(-1172698955);
    }

    public static /* synthetic */ Object ipc$super(FlowBar flowBar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ FlowBarItem access$000(FlowBar flowBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FlowBarItem) ipChange.ipc$dispatch("3916889e", new Object[]{flowBar}) : flowBar.mCurrentItem;
    }

    public static /* synthetic */ FlowBarItem access$002(FlowBar flowBar, FlowBarItem flowBarItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FlowBarItem) ipChange.ipc$dispatch("32c07aef", new Object[]{flowBar, flowBarItem});
        }
        flowBar.mCurrentItem = flowBarItem;
        return flowBarItem;
    }

    public FlowBar(Context context) {
        super(context);
        this.mCurrentItem = null;
        this.mCtx = context;
    }

    public String init(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6431171f", new Object[]{this, str});
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.mPosition = jSONObject.optInt("position");
            String optString = jSONObject.optString("boardId");
            String optString2 = jSONObject.optString("height");
            String optString3 = jSONObject.optString("buttonWidth");
            String optString4 = jSONObject.optString("backgroundColor");
            String optString5 = jSONObject.optString("splitColor");
            String optString6 = jSONObject.optString("splitWidth");
            String optString7 = jSONObject.optString("splitTop");
            String optString8 = jSONObject.optString("splitBottom");
            init(getInt(optString), getInt(optString3), getInt(optString2), optString4, optString5, getInt(optString6), getInt(optString7), getInt(optString8, getInt(optString2)), jSONObject.optString("bottomColor"), getInt(jSONObject.optString("bottomWidth")), getInt(jSONObject.optString("choosedIndex")), jSONObject.getJSONArray("buttons"));
            return optString;
        } catch (JSONException unused) {
            return "";
        }
    }

    public RelativeLayout createLayout() {
        RelativeLayout relativeLayout;
        RadioGroup radioGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RelativeLayout) ipChange.ipc$dispatch("cd9451d", new Object[]{this});
        }
        if (this.mPosition == 0) {
            relativeLayout = (RelativeLayout) LayoutInflater.from(this.mCtx).inflate(R.layout.flowbar_top, (ViewGroup) null);
            radioGroup = (RadioGroup) relativeLayout.findViewById(R.id.flowbar_top);
        } else {
            relativeLayout = (RelativeLayout) LayoutInflater.from(this.mCtx).inflate(R.layout.flowbar_bottom, (ViewGroup) null);
            radioGroup = (RadioGroup) relativeLayout.findViewById(R.id.flowbar_bottom);
        }
        radioGroup.addView(this);
        return relativeLayout;
    }

    private void init(int i, int i2, int i3, String str, String str2, int i4, int i5, int i6, String str3, int i7, int i8, JSONArray jSONArray) {
        int i9 = i2;
        int i10 = i4;
        int i11 = i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e480e27", new Object[]{this, new Integer(i), new Integer(i9), new Integer(i3), str, str2, new Integer(i10), new Integer(i11), new Integer(i6), str3, new Integer(i7), new Integer(i8), jSONArray});
            return;
        }
        Resources resources = this.mCtx.getResources();
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this.mCtx);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        RadioGroup radioGroup = new RadioGroup(this.mCtx);
        radioGroup.setOrientation(0);
        setBackgroundColor(Color.parseColor("#" + str));
        int length = jSONArray.length();
        int i12 = 0;
        while (i12 < length) {
            int i13 = length;
            HorizontalScrollView horizontalScrollView2 = horizontalScrollView;
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.mCtx).inflate(R.layout.flowbar_item, (ViewGroup) null);
            FlowBarItem flowBarItem = new FlowBarItem(this.mCtx, linearLayout);
            RadioGroup radioGroup2 = radioGroup;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10, -1);
            layoutParams.topMargin = i11 * 2;
            layoutParams.bottomMargin = i6 * 2;
            View view = new View(this.mCtx);
            view.setLayoutParams(layoutParams);
            view.setBackgroundColor(Color.parseColor("#" + str2));
            View view2 = new View(this.mCtx);
            view2.setLayoutParams(layoutParams);
            view2.setBackgroundColor(Color.parseColor("#" + str2));
            flowBarItem.setText("item" + i12);
            flowBarItem.setDrawable(toDrawable(resources, "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"));
            flowBarItem.setFont(-65536, 13.0f);
            flowBarItem.setSize(i9 * 2, i3 * 2);
            flowBarItem.addView(view);
            flowBarItem.addView(linearLayout);
            flowBarItem.addView(view2);
            flowBarItem.setBottomLine(str3, i7);
            radioGroup2.addView(flowBarItem);
            flowBarItem.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.browser.view.FlowBar.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view3});
                    } else if (!(view3 instanceof FlowBarItem)) {
                    } else {
                        FlowBarItem flowBarItem2 = (FlowBarItem) view3;
                        if (flowBarItem2.equals(FlowBar.access$000(FlowBar.this))) {
                            return;
                        }
                        if (FlowBar.access$000(FlowBar.this).getLeft() < flowBarItem2.getLeft()) {
                            FlowBar.access$000(FlowBar.this).changeState(false, 1);
                            flowBarItem2.changeState(true, 1);
                        } else {
                            FlowBar.access$000(FlowBar.this).changeState(false, 2);
                            flowBarItem2.changeState(true, 2);
                        }
                        FlowBar.access$002(FlowBar.this, flowBarItem2);
                    }
                }
            });
            if (i12 == 0) {
                flowBarItem.changeState(true, 0);
                this.mCurrentItem = flowBarItem;
            }
            i12++;
            length = i13;
            i10 = i4;
            i11 = i5;
            horizontalScrollView = horizontalScrollView2;
            radioGroup = radioGroup2;
            i9 = i2;
        }
        addView(horizontalScrollView);
        horizontalScrollView.addView(radioGroup);
    }

    private Drawable toDrawable(Resources resources, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("bd9b712f", new Object[]{this, resources, str});
        }
        if (str == null) {
            return null;
        }
        try {
            return new BitmapDrawable(resources, BitmapFactory.decodeStream(new ByteArrayInputStream(Base64.decode(str, 0))));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private int getInt(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c755427d", new Object[]{this, str})).intValue() : getInt(str, 0);
    }

    private int getInt(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{this, str, new Integer(i)})).intValue();
        }
        if (str.contains(riy.MOD)) {
            String substring = str.substring(0, str.indexOf(riy.MOD));
            WindowManager windowManager = (WindowManager) this.mCtx.getSystemService(a.ATOM_EXT_window);
            if (i == 0) {
                i = windowManager.getDefaultDisplay().getWidth();
            }
            return (i * Integer.valueOf(substring).intValue()) / 200;
        }
        return Integer.valueOf(str).intValue();
    }
}
