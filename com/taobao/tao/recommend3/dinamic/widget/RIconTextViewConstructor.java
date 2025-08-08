package com.taobao.tao.recommend3.dinamic.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.constructor.DTextViewConstructor;
import java.util.ArrayList;
import java.util.Map;
import tb.fpd;
import tb.fpr;
import tb.kge;
import tb.ooc;

/* loaded from: classes.dex */
public class RIconTextViewConstructor extends DTextViewConstructor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(986721616);
    }

    public static /* synthetic */ Object ipc$super(RIconTextViewConstructor rIconTextViewConstructor, String str, Object... objArr) {
        if (str.hashCode() == 333836301) {
            super.setAttributes((View) objArr[0], (Map) objArr[1], (ArrayList) objArr[2], (fpd) objArr[3]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamic.constructor.DTextViewConstructor, com.taobao.android.dinamic.dinamic.h
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet}) : new RIconTextView(context, attributeSet);
    }

    @Override // com.taobao.android.dinamic.constructor.DTextViewConstructor, com.taobao.android.dinamic.dinamic.h
    public void setAttributes(View view, Map<String, Object> map, ArrayList<String> arrayList, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e5f00d", new Object[]{this, view, map, arrayList, fpdVar});
            return;
        }
        super.setAttributes(view, map, arrayList, fpdVar);
        RIconTextView rIconTextView = (RIconTextView) view;
        if (arrayList.contains("rIconUrl")) {
            setImageUrl(rIconTextView, (String) map.get("rIconUrl"));
        }
        if (!arrayList.contains("rLineSpacing")) {
            return;
        }
        setLineSpacingExtra(rIconTextView, (String) map.get("rLineSpacing"));
    }

    private void setImageUrl(final RIconTextView rIconTextView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36e4358c", new Object[]{this, rIconTextView, str});
            return;
        }
        rIconTextView.setIcon(null);
        if (StringUtils.isEmpty(str)) {
            return;
        }
        ooc.a(str, rIconTextView.getContext(), new ooc.a() { // from class: com.taobao.tao.recommend3.dinamic.widget.RIconTextViewConstructor.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ooc.a
            public void a(Drawable drawable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                } else {
                    rIconTextView.setIcon(drawable);
                }
            }
        }, null);
    }

    private void setLineSpacingExtra(RIconTextView rIconTextView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e73f3659", new Object[]{this, rIconTextView, str});
        } else {
            rIconTextView.setLineSpacingExtra(fpr.a(rIconTextView.getContext(), str, 3));
        }
    }
}
