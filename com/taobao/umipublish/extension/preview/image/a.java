package com.taobao.umipublish.extension.preview.image;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.label.LabelContainer;
import com.taobao.android.label.LabelData;
import com.taobao.android.label.LabelStyle;
import com.taobao.android.litecreator.util.at;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.phenix.request.d;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.PhenixOptions;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.umipublish.extension.preview.PreviewModel;
import java.util.ArrayList;
import java.util.Iterator;
import tb.hfh;
import tb.kge;
import tb.rcz;

/* loaded from: classes9.dex */
public class a implements com.taobao.umipublish.extension.preview.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1778855357);
        kge.a(1370978373);
    }

    @Override // com.taobao.umipublish.extension.preview.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    @Override // com.taobao.umipublish.extension.preview.a
    public void a(View view, PreviewModel.Media media) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fad731e3", new Object[]{this, view, media});
        }
    }

    @Override // com.taobao.umipublish.extension.preview.a
    public View a(ViewGroup viewGroup, final PreviewModel.Media media) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("982ddde2", new Object[]{this, viewGroup, media});
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lay_umi_image_preview_item, viewGroup, false);
        final LabelContainer findViewById = inflate.findViewById(R.id.fl_label_container);
        final TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.preview_image);
        tUrlImageView.setPhenixOptions(new PhenixOptions().bitmapProcessors(hfh.INSTANCE));
        tUrlImageView.setImageUrl(media.path.startsWith("http") ? media.path : d.a(media.path));
        tUrlImageView.succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.umipublish.extension.preview.image.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.intf.event.a
            public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
            }

            public boolean a(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                }
                if (succPhenixEvent.getDrawable() != null && !succPhenixEvent.isIntermediate()) {
                    BitmapDrawable drawable = succPhenixEvent.getDrawable();
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    ViewGroup.LayoutParams layoutParams = tUrlImageView.getLayoutParams();
                    if (intrinsicWidth > 0 && intrinsicHeight > 0 && layoutParams != null && tUrlImageView.getWidth() > 0 && tUrlImageView.getHeight() > 0) {
                        float f = intrinsicHeight / intrinsicWidth;
                        if (f > tUrlImageView.getHeight() / tUrlImageView.getWidth()) {
                            layoutParams.width = (int) (tUrlImageView.getHeight() / f);
                        } else {
                            layoutParams.height = (int) (f * tUrlImageView.getWidth());
                        }
                    }
                    findViewById.post(new Runnable() { // from class: com.taobao.umipublish.extension.preview.image.a.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            ArrayList arrayList = new ArrayList();
                            LabelStyle a2 = rcz.a();
                            Iterator<PreviewModel.Tag> it = media.tags.iterator();
                            while (it.hasNext()) {
                                PreviewModel.Tag next = it.next();
                                LabelData labelData = new LabelData();
                                labelData.posX = next.posX;
                                labelData.posY = next.posY;
                                labelData.labelStyle = a2;
                                labelData.content = next.tagName;
                                if (TextUtils.equals("left", next.direction)) {
                                    labelData.direction = 0;
                                } else if (TextUtils.equals("right", next.direction)) {
                                    labelData.direction = 1;
                                } else {
                                    labelData.direction = at.a(next.direction, 0);
                                }
                                arrayList.add(labelData);
                            }
                            findViewById.enableMove(false);
                            findViewById.enableRotate(false);
                            findViewById.setLabelRegion(new Rect(0, 0, findViewById.getWidth(), findViewById.getHeight()));
                            findViewById.setMarkList(arrayList);
                        }
                    });
                }
                return false;
            }
        });
        viewGroup.addView(inflate);
        inflate.setTag(media);
        return inflate;
    }

    @Override // com.taobao.umipublish.extension.preview.a
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        ViewParent parent = view.getParent();
        if (parent == null) {
            return;
        }
        ((ViewGroup) parent).removeView(view);
    }
}
