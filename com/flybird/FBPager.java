package com.flybird;

import android.content.Context;
import android.view.View;
import com.alipay.birdnest.util.FBLogger;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.PagerView;
import tb.riy;

/* loaded from: classes4.dex */
public class FBPager extends FBView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int A;

    public FBPager(Context context, FBDocument fBDocument) {
        super(context, new PagerView(context), fBDocument);
        this.A = 0;
    }

    public static /* synthetic */ Object ipc$super(FBPager fBPager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != 190242413) {
            if (hashCode == 663633004) {
                super.updateEvent((String) objArr[0], (String) objArr[1]);
                return null;
            } else if (hashCode != 896733613) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.removeView((FBView) objArr[0]);
                return null;
            }
        }
        return super.invoke((String) objArr[0], (String) objArr[1]);
    }

    @Override // com.flybird.FBView
    public void addView(FBView fBView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76744a", new Object[]{this, fBView});
            return;
        }
        View innerView = getInnerView();
        View innerView2 = fBView.getInnerView();
        fBView.setParentIsListView(true);
        ((PagerView) innerView).b.add(innerView2);
    }

    @Override // com.flybird.FBView
    public String invoke(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b56de6d", new Object[]{this, str, str2});
        }
        PagerView pagerView = (PagerView) getInnerView();
        if (pagerView == null) {
            return "0";
        }
        if ("getCurrentPage".equals(str)) {
            return "{\"page:\"" + this.A + riy.BLOCK_END_STR;
        } else if ("setCurrentPage".equals(str)) {
            try {
                pagerView.setCurrentPage(Integer.parseInt(str2));
                return "0";
            } catch (Throwable th) {
                FBLogger.e(FBView.TAG, th);
                return "0";
            }
        } else {
            return super.invoke(str, str2);
        }
    }

    @Override // com.flybird.FBView
    public void removeView(FBView fBView) {
        View innerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("357311ad", new Object[]{this, fBView});
            return;
        }
        super.removeView(fBView);
        fBView.setParentIsListView(false);
        View innerView2 = fBView.getInnerView();
        if (innerView2 == null || (innerView = getInnerView()) == null) {
            return;
        }
        ((PagerView) innerView).b.remove(innerView2);
    }

    @Override // com.flybird.FBView
    public void updateEvent(String str, String str2) {
        PagerView pagerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("278e3c6c", new Object[]{this, str, str2});
            return;
        }
        super.updateEvent(str, str2);
        if (!"onpagevisible".equals(str2) || (pagerView = (PagerView) getInnerView()) == null) {
            return;
        }
        pagerView.setViewItemObserver(new PagerView.ViewItemObserver() { // from class: com.flybird.FBPager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.flybird.PagerView.ViewItemObserver
            public void onItemChanged(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b5de2bda", new Object[]{this, new Integer(i)});
                    return;
                }
                FBPager.this.A = i;
                FBLogger.d(FBView.TAG, "onItemChanged(), selectedPage:" + i);
                FBDocument.a(FBPager.this.mDoc, FBPager.this.getNode(), "onpagevisible", String.valueOf(i));
            }
        });
    }
}
