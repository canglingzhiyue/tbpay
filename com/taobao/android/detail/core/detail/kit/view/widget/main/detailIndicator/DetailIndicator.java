package com.taobao.android.detail.core.detail.kit.view.widget.main.detailIndicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.widget.main.detailIndicator.commonnavigator.CommonNavigator;
import com.taobao.android.detail.core.detail.kit.view.widget.main.detailIndicator.commonnavigator.LineNavigator;
import java.util.ArrayList;
import tb.ebp;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class DetailIndicator extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ArrayList<a> mListeners;
    private ebp mNavigator;

    /* loaded from: classes4.dex */
    public interface a {
        void onDetailIndicatorPageScrolled(int i, float f, int i2);

        void onDetailIndicatorPageScrolled(int i, int i2, float f, int i3);
    }

    static {
        kge.a(-1018555414);
    }

    public DetailIndicator(Context context) {
        super(context);
        this.mListeners = new ArrayList<>();
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.main.detailIndicator.DetailIndicator");
    }

    public DetailIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mListeners = new ArrayList<>();
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.main.detailIndicator.DetailIndicator");
    }

    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        } else if (this.mNavigator != null) {
            if (this.mListeners != null) {
                for (int i3 = 0; i3 < this.mListeners.size(); i3++) {
                    this.mListeners.get(i3).onDetailIndicatorPageScrolled(i, f, i2);
                }
            }
            this.mNavigator.onPageScrolled(i, f, i2);
        }
    }

    public void onPageScrolled(int i, int i2, float f, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a38f8204", new Object[]{this, new Integer(i), new Integer(i2), new Float(f), new Integer(i3)});
        } else if (this.mNavigator != null) {
            if (this.mListeners != null) {
                for (int i4 = 0; i4 < this.mListeners.size(); i4++) {
                    this.mListeners.get(i4).onDetailIndicatorPageScrolled(i, i2, f, i3);
                }
            }
            if (i > i2) {
                i2 = i;
                i = i2;
            }
            this.mNavigator.onPageScrolled(i, i2, f, i3);
        }
    }

    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            return;
        }
        ebp ebpVar = this.mNavigator;
        if (ebpVar == null) {
            return;
        }
        ebpVar.onPageSelected(i);
    }

    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            return;
        }
        ebp ebpVar = this.mNavigator;
        if (ebpVar == null) {
            return;
        }
        ebpVar.onPageScrollStateChanged(i);
    }

    public void addDetailIndicatorListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a0adca0", new Object[]{this, aVar});
            return;
        }
        ArrayList<a> arrayList = this.mListeners;
        if (arrayList == null) {
            return;
        }
        arrayList.add(aVar);
    }

    public void setNoItemSelected(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a0fa99c", new Object[]{this, new Boolean(z)});
            return;
        }
        ebp ebpVar = this.mNavigator;
        if (ebpVar == null) {
            return;
        }
        ebpVar.setNoItemSelected(z);
    }

    public void setCurrentPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ed9025c", new Object[]{this, new Integer(i)});
            return;
        }
        ebp ebpVar = this.mNavigator;
        if (ebpVar == null) {
            return;
        }
        ebpVar.setCurrentPosition(i);
    }

    public int getCurrentPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b656e206", new Object[]{this})).intValue();
        }
        ebp ebpVar = this.mNavigator;
        if (ebpVar != null) {
            if (ebpVar instanceof CommonNavigator) {
                return ((CommonNavigator) ebpVar).getCurrentPosition();
            }
            if (ebpVar instanceof LineNavigator) {
                return ((LineNavigator) ebpVar).getCurrentPosition();
            }
        }
        return 0;
    }

    public int getLastPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73467e4f", new Object[]{this})).intValue();
        }
        ebp ebpVar = this.mNavigator;
        if (ebpVar != null) {
            if (ebpVar instanceof CommonNavigator) {
                return ((CommonNavigator) ebpVar).getLastPosition();
            }
            if (ebpVar instanceof LineNavigator) {
                return ((LineNavigator) ebpVar).getCurrentPosition();
            }
        }
        return 0;
    }

    public void setNavigator(ebp ebpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c697bc39", new Object[]{this, ebpVar});
            return;
        }
        ebp ebpVar2 = this.mNavigator;
        if (ebpVar2 == ebpVar) {
            return;
        }
        if (ebpVar2 != null) {
            ebpVar2.onDetachFromDetailIndicator();
        }
        this.mNavigator = ebpVar;
        removeAllViews();
        if (!(this.mNavigator instanceof View)) {
            return;
        }
        addView((View) this.mNavigator, new FrameLayout.LayoutParams(-1, -1));
        this.mNavigator.onAttachToDetailIndicator();
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        ebp ebpVar = this.mNavigator;
        if (ebpVar == null) {
            return;
        }
        ebpVar.onDestroy();
    }
}
