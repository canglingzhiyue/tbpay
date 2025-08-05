package com.taobao.taolive.uikit.favor;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.kge;
import tb.prk;
import tb.prn;
import tb.prq;
import tb.prr;

/* loaded from: classes8.dex */
public class TaoliveFavorComponent extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mContext;
    private b mFavorLayout;
    private TextView mFavorNum;
    private boolean mPlayFavor;

    static {
        kge.a(-1663276421);
    }

    public static /* synthetic */ Object ipc$super(TaoliveFavorComponent taoliveFavorComponent, String str, Object... objArr) {
        if (str.hashCode() == -461309207) {
            super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ b access$000(TaoliveFavorComponent taoliveFavorComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("98d280aa", new Object[]{taoliveFavorComponent}) : taoliveFavorComponent.mFavorLayout;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        if (prr.m()) {
            LayoutInflater.from(this.mContext).inflate(R.layout.tbliveuikit_new_favor_component, this);
        } else {
            LayoutInflater.from(this.mContext).inflate(R.layout.tbliveuikit_favor_component, this);
        }
        this.mFavorNum = (TextView) findViewById(R.id.taolive_video_item_favor_num);
        this.mFavorLayout = (b) findViewById(R.id.taolive_fake_favor);
        this.mFavorLayout.setFavorDuration(2000);
        this.mFavorLayout.setScaleFactor(0.5d);
    }

    public void setFavorNum(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66e6beb2", new Object[]{this, new Integer(i)});
        } else {
            this.mFavorNum.setText(prk.b(i));
        }
    }

    public TaoliveFavorComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mPlayFavor = true;
        this.mContext = context;
        init();
    }

    public TaoliveFavorComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPlayFavor = true;
        this.mContext = context;
        init();
    }

    public TaoliveFavorComponent(Context context) {
        super(context);
        this.mPlayFavor = true;
        this.mContext = context;
        init();
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        b bVar = this.mFavorLayout;
        if (bVar == null) {
            return;
        }
        bVar.stopFakeFavor();
    }

    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        b bVar = this.mFavorLayout;
        if (bVar == null || !this.mPlayFavor) {
            return;
        }
        bVar.startFakeFavor();
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        b bVar = this.mFavorLayout;
        if (bVar == null) {
            return;
        }
        bVar.destroy();
    }

    public void setMaxDeviceLevel(int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9713b10", new Object[]{this, new Integer(i)});
            return;
        }
        int b = prq.b();
        if (b >= i) {
            z = false;
        }
        this.mPlayFavor = z;
        if (i != 100 && b == 0) {
            this.mPlayFavor = false;
        }
        if (!this.mPlayFavor) {
            pause();
        } else {
            resume();
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        b bVar = this.mFavorLayout;
        if (bVar == null) {
            return;
        }
        if (i == 8 || i == 4) {
            this.mFavorLayout.stopFakeFavor();
        } else if (i != 0 || !this.mPlayFavor) {
        } else {
            bVar.startFakeFavor();
        }
    }

    private void getFavorImgs(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47b1d649", new Object[]{this, str});
        } else {
            prn.a().a(str, new prn.a() { // from class: com.taobao.taolive.uikit.favor.TaoliveFavorComponent.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.prn.a
                public void a(ArrayList<Drawable> arrayList) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
                    } else if (arrayList == null || arrayList.size() <= 0 || TaoliveFavorComponent.access$000(TaoliveFavorComponent.this) == null) {
                    } else {
                        TaoliveFavorComponent.access$000(TaoliveFavorComponent.this).setDrawables(arrayList);
                    }
                }
            });
        }
    }

    public void setFavorImg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef704278", new Object[]{this, str});
        } else {
            getFavorImgs(str);
        }
    }
}
