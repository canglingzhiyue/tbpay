package com.taobao.android.detail.core.standard.widget.lightoff.vm;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.ext.view.widget.base.TouchImageView;
import com.taobao.android.detail.core.standard.widget.lightoff.a;
import com.taobao.android.detail.core.standard.widget.lightoff.model.LightOffItemModel;
import com.taobao.android.detail.ttdetail.utils.q;
import java.io.Serializable;
import tb.emu;
import tb.epj;
import tb.kge;

/* loaded from: classes4.dex */
public class PictureViewModel implements ILightOffViewModel, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE = "PICTRUE";
    private TouchImageView mPhotoView;

    static {
        kge.a(-1042786362);
        kge.a(-1278991038);
        kge.a(1028243835);
    }

    @Override // com.taobao.android.detail.core.standard.widget.lightoff.vm.ILightOffViewModel
    public String getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : TYPE;
    }

    @Override // com.taobao.android.detail.core.standard.widget.lightoff.vm.ILightOffViewModel
    public View getView(Context context, final LightOffItemModel lightOffItemModel, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("80c9bede", new Object[]{this, context, lightOffItemModel, aVar});
        }
        if (!TYPE.equals(lightOffItemModel.type)) {
            return null;
        }
        this.mPhotoView = new TouchImageView(context);
        this.mPhotoView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        if (emu.c()) {
            q.a(this.mPhotoView, lightOffItemModel.url);
        } else {
            epj.b().a(lightOffItemModel.url, this.mPhotoView);
        }
        this.mPhotoView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.standard.widget.lightoff.vm.PictureViewModel.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                try {
                    if (aVar == null) {
                        return;
                    }
                    aVar.a(lightOffItemModel.originData, view);
                } catch (Throwable unused) {
                }
            }
        });
        this.mPhotoView.setOnSinglePointLongClickListener(new View.OnLongClickListener() { // from class: com.taobao.android.detail.core.standard.widget.lightoff.vm.PictureViewModel.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                }
                try {
                    if (aVar != null) {
                        aVar.b(lightOffItemModel.originData, view);
                    }
                } catch (Throwable unused) {
                }
                return false;
            }
        });
        return this.mPhotoView;
    }

    @Override // com.taobao.android.detail.core.standard.widget.lightoff.vm.ILightOffViewModel
    public Drawable createSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("995c4f3", new Object[]{this});
        }
        TouchImageView touchImageView = this.mPhotoView;
        if (touchImageView != null) {
            return touchImageView.getDrawable();
        }
        return null;
    }

    @Override // com.taobao.android.detail.core.standard.widget.lightoff.vm.ILightOffViewModel
    public boolean allowPull() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8a436b9", new Object[]{this})).booleanValue() : !this.mPhotoView.isScaled();
    }
}
