package com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import tb.gbg;
import tb.kge;
import tb.ldf;
import tb.lfq;
import tb.mto;
import tb.thb;

/* loaded from: classes7.dex */
public class HMultiSelectView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FEEDBACK_ROOT_USER_ID = "feedback_collection_root";
    private static final String KEY_IS_SELECT_ITEM = "isSelectItem";
    public static final String KEY_MULTI_SELECT_TEXT = "multiSelectText";
    private static final String SEPARATOR = ";";
    private static final String TAG = "HMultiSelectView";
    private double buttonCornerRadius;
    private final HashMap<TextView, Boolean> clickStatusMap;
    private boolean isBold;
    private double itemHeight;
    private double multiTextSize;
    private int selectBackgroundColor;
    private int selectTextColor;
    private int unSelectBackgroundColor;
    private int unSelectTextColor;

    static {
        kge.a(564620746);
    }

    public static /* synthetic */ Object ipc$super(HMultiSelectView hMultiSelectView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(HMultiSelectView hMultiSelectView, TextView textView, BaseSectionModel baseSectionModel, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eb194ed", new Object[]{hMultiSelectView, textView, baseSectionModel, dXRootView});
        } else {
            hMultiSelectView.onClickItem(textView, baseSectionModel, dXRootView);
        }
    }

    public HMultiSelectView(Context context) {
        super(context);
        this.clickStatusMap = new HashMap<>();
        this.isBold = false;
        this.multiTextSize = 12.0d;
        this.buttonCornerRadius = 4.0d;
        this.itemHeight = 30.0d;
        init();
    }

    public HMultiSelectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.clickStatusMap = new HashMap<>();
        this.isBold = false;
        this.multiTextSize = 12.0d;
        this.buttonCornerRadius = 4.0d;
        this.itemHeight = 30.0d;
        init();
    }

    public HMultiSelectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.clickStatusMap = new HashMap<>();
        this.isBold = false;
        this.multiTextSize = 12.0d;
        this.buttonCornerRadius = 4.0d;
        this.itemHeight = 30.0d;
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            setOrientation(1);
        }
    }

    public void setItemList(JSONArray jSONArray, final BaseSectionModel<?> baseSectionModel, final DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d88cb", new Object[]{this, jSONArray, baseSectionModel, dXRootView});
        } else if (jSONArray != null && jSONArray.size() != 0) {
            int b = gbg.b(getContext(), 8.0f);
            int b2 = gbg.b(getContext(), 8.0f);
            if (this.itemHeight <= mto.a.GEO_NOT_SUPPORT) {
                this.itemHeight = 30.0d;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gbg.b(getContext(), 155.0f), gbg.b(getContext(), (float) this.itemHeight));
            layoutParams.setMargins(b2, b, b2, 0);
            layoutParams.gravity = 1;
            for (int i = 0; i < jSONArray.size(); i++) {
                String string = jSONArray.getString(i);
                TextView textView = new TextView(getContext());
                if (this.isBold) {
                    textView.setTypeface(null, 1);
                }
                textView.setGravity(17);
                textView.setText(string);
                textView.setMaxLines(1);
                textView.setTextSize((float) this.multiTextSize);
                setTextStyle(textView, false);
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.HMultiSelectView.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else {
                            HMultiSelectView.access$000(HMultiSelectView.this, (TextView) view, baseSectionModel, dXRootView);
                        }
                    }
                });
                addView(textView, layoutParams);
            }
        }
    }

    public void setIsBold(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81af4bfc", new Object[]{this, new Boolean(z)});
        } else {
            this.isBold = z;
        }
    }

    public void setMultiTextSize(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19fd05d2", new Object[]{this, new Double(d)});
        } else if (d <= mto.a.GEO_NOT_SUPPORT) {
        } else {
            this.multiTextSize = d;
        }
    }

    public void setCornerRadius(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c77d6e", new Object[]{this, new Double(d)});
        } else if (this.buttonCornerRadius <= mto.a.GEO_NOT_SUPPORT) {
        } else {
            this.buttonCornerRadius = d;
        }
    }

    public void setItemHeight(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d21779fb", new Object[]{this, new Double(d)});
        } else if (d <= mto.a.GEO_NOT_SUPPORT) {
        } else {
            this.itemHeight = d;
        }
    }

    public void setSelectTextColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faffa869", new Object[]{this, str});
        } else if (str == null) {
            this.selectTextColor = Color.parseColor("FF6200");
        } else {
            try {
                this.selectTextColor = Color.parseColor(str);
            } catch (IllegalArgumentException unused) {
                this.selectTextColor = Color.parseColor("FF6200");
                ldf.d(TAG, "parse select color failed");
            }
        }
    }

    public void setUnSelectTextColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47c64dd0", new Object[]{this, str});
        } else if (str == null) {
            this.unSelectTextColor = Color.parseColor("#111111");
        } else {
            try {
                this.unSelectTextColor = Color.parseColor(str);
            } catch (IllegalArgumentException unused) {
                this.unSelectTextColor = Color.parseColor("#111111");
                ldf.d(TAG, "parse Unselect color failed");
            }
        }
    }

    public void setSelectBackgroundColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b777e48", new Object[]{this, str});
        } else if (str == null) {
            this.selectBackgroundColor = Color.parseColor("#19FF6200");
        } else {
            try {
                this.selectBackgroundColor = Color.parseColor(str);
            } catch (IllegalArgumentException unused) {
                this.selectBackgroundColor = Color.parseColor("#19FF6200");
                ldf.d(TAG, "parse select Background color failed");
            }
        }
    }

    public void setUnSelectBackgroundColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8903a6f", new Object[]{this, str});
        } else if (str == null) {
            this.unSelectBackgroundColor = Color.parseColor("#F3F6F8");
        } else {
            try {
                this.unSelectBackgroundColor = Color.parseColor(str);
            } catch (IllegalArgumentException unused) {
                this.unSelectBackgroundColor = Color.parseColor("#F3F6F8");
                ldf.d(TAG, "parse select Background color failed");
            }
        }
    }

    private void onClickItem(TextView textView, BaseSectionModel<?> baseSectionModel, DXRootView dXRootView) {
        String addSelectItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("649d3cca", new Object[]{this, textView, baseSectionModel, dXRootView});
        } else if (textView == null || baseSectionModel == null) {
        } else {
            Boolean bool = this.clickStatusMap.get(textView);
            if (bool == null) {
                bool = false;
            }
            String a2 = lfq.a(baseSectionModel, KEY_MULTI_SELECT_TEXT);
            if (bool.booleanValue()) {
                setTextStyle(textView, false);
                addSelectItem = TextUtils.isEmpty(a2) ? "" : removeSelectItem(a2, textView.getText().toString());
            } else {
                setTextStyle(textView, true);
                if (TextUtils.isEmpty(a2)) {
                    addSelectItem = textView.getText().toString();
                } else {
                    addSelectItem = addSelectItem(a2, textView.getText().toString());
                }
            }
            if (TextUtils.isEmpty(addSelectItem)) {
                lfq.a(baseSectionModel, KEY_IS_SELECT_ITEM, "false");
            } else {
                lfq.a(baseSectionModel, KEY_IS_SELECT_ITEM, "true");
            }
            lfq.a(baseSectionModel, KEY_MULTI_SELECT_TEXT, addSelectItem);
            thb.a(FEEDBACK_ROOT_USER_ID, dXRootView);
            this.clickStatusMap.put(textView, Boolean.valueOf(!bool.booleanValue()));
        }
    }

    private void setTextStyle(TextView textView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e8edd99", new Object[]{this, textView, new Boolean(z)});
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (z) {
            gradientDrawable.setColor(this.selectBackgroundColor);
            textView.setTextColor(this.selectTextColor);
        } else {
            gradientDrawable.setColor(this.unSelectBackgroundColor);
            textView.setTextColor(this.unSelectTextColor);
        }
        if (this.buttonCornerRadius <= mto.a.GEO_NOT_SUPPORT) {
            this.buttonCornerRadius = 4.0d;
        }
        gradientDrawable.setCornerRadius(gbg.b(getContext(), (float) this.buttonCornerRadius));
        if (Build.VERSION.SDK_INT < 16) {
            return;
        }
        textView.setBackground(gradientDrawable);
    }

    private String addSelectItem(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e35c4c35", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str + ";" + str2;
    }

    private String removeSelectItem(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("582d3572", new Object[]{this, str, str2});
        }
        ArrayList<String> arrayList = new ArrayList(Arrays.asList(str.split(";")));
        arrayList.remove(str2);
        StringBuilder sb = new StringBuilder();
        for (String str3 : arrayList) {
            if (sb.length() > 0) {
                sb.append(";");
            }
            sb.append(str3);
        }
        return sb.toString();
    }
}
