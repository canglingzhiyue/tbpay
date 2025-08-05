package com.taobao.taolive.uikit.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import tb.kge;
import tb.pqs;
import tb.pqv;
import tb.pqw;

/* loaded from: classes8.dex */
public class TBLiveFlipper extends TaoliveHomeFlipperView implements pqs, pqw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private pqv mCardChangeListener;

    static {
        kge.a(-1504071987);
        kge.a(-750533237);
        kge.a(1123141180);
    }

    public static /* synthetic */ Object ipc$super(TBLiveFlipper tBLiveFlipper, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1179718721) {
            super.setDisplayedChild(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode != -489906275) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.pageChange(((Number) objArr[0]).intValue());
            return null;
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public pqw.a getInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pqw.a) ipChange.ipc$dispatch("eee81108", new Object[]{this});
        }
        return null;
    }

    @Override // tb.pqs
    public void makeView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("960c80ba", new Object[]{this});
        }
    }

    @Override // tb.pqw
    public boolean needLazyLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c7455bb", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public TBLiveFlipper(Context context) {
        super(context);
    }

    public TBLiveFlipper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // tb.pqs
    public void setChildViews(ArrayList<View> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f643e54f", new Object[]{this, arrayList});
        } else if (arrayList == null || arrayList.size() <= 0) {
        } else {
            removeChildViews();
            Iterator<View> it = arrayList.iterator();
            while (it.hasNext()) {
                addChildView(it.next());
            }
        }
    }

    public void addChildView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51bfb6ab", new Object[]{this, view});
        } else if (view == null) {
        } else {
            addView(view);
        }
    }

    @Override // tb.pqs
    public void removeChildViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4d36fdd", new Object[]{this});
        } else {
            removeAllViews();
        }
    }

    @Override // tb.pqs
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else {
            stopFlipping();
        }
    }

    @Override // tb.pqs
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        } else {
            startFlipping();
        }
    }

    @Override // com.taobao.taolive.uikit.view.TaoliveHomeFlipperView, com.taobao.taolive.uikit.component.ViewFlipperExt
    public void pageChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2cc9f9d", new Object[]{this, new Integer(i)});
            return;
        }
        super.pageChange(i);
        pqv pqvVar = this.mCardChangeListener;
        if (pqvVar == null) {
            return;
        }
        pqvVar.a(i);
    }

    @Override // tb.pqw
    public void setOnCardChangeListener(pqv pqvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5ef8d37", new Object[]{this, pqvVar});
        } else {
            this.mCardChangeListener = pqvVar;
        }
    }

    @Override // tb.pqw
    public void setCurrentCard(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e45e555", new Object[]{this, new Integer(i)});
        } else {
            setDisplayedChild(i);
        }
    }

    @Override // com.taobao.taolive.uikit.component.ViewAnimatorExt
    public void setDisplayedChild(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9aeebbf", new Object[]{this, new Integer(i)});
            return;
        }
        super.setDisplayedChild(i);
        pqv pqvVar = this.mCardChangeListener;
        if (pqvVar == null) {
            return;
        }
        pqvVar.b(i);
    }
}
