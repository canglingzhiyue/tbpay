package com.taobao.browser.jsbridge.ui;

import android.content.Context;
import android.taobao.windvane.util.m;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.b;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import java.util.ArrayList;
import java.util.Iterator;
import tb.kge;

/* loaded from: classes6.dex */
public class ImageListView extends ListView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ImageStrategyConfig mConfig;
    private Context mContext;
    public ArrayList<String> mImgUrls;

    static {
        kge.a(-674107162);
    }

    public static /* synthetic */ ImageStrategyConfig access$000(ImageListView imageListView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageStrategyConfig) ipChange.ipc$dispatch("acc14f09", new Object[]{imageListView}) : imageListView.mConfig;
    }

    public ImageListView(Context context) {
        super(context);
        this.mContext = null;
        this.mConfig = ImageStrategyConfig.a("windvane", 98).a();
        this.mImgUrls = new ArrayList<>();
        init(context);
    }

    public ImageListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContext = null;
        this.mConfig = ImageStrategyConfig.a("windvane", 98).a();
        this.mImgUrls = new ArrayList<>();
        init(context);
    }

    public ImageListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContext = null;
        this.mConfig = ImageStrategyConfig.a("windvane", 98).a();
        this.mImgUrls = new ArrayList<>();
        init(context);
    }

    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        setAdapter((ListAdapter) new ImageAdapter(context));
        this.mContext = context;
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.mImgUrls = null;
        this.mContext = null;
    }

    public boolean setImageUrls(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba4d278a", new Object[]{this, arrayList})).booleanValue();
        }
        this.mImgUrls.clear();
        if (arrayList == null) {
            return false;
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            this.mImgUrls.add(it.next());
        }
        return true;
    }

    /* loaded from: classes6.dex */
    public class ImageAdapter extends BaseAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private RatioImageViewEX imageview;
        private Context mContext;

        static {
            kge.a(1902434450);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
            }
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
            }
            return 0L;
        }

        public static /* synthetic */ Context access$100(ImageAdapter imageAdapter) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("977b5cef", new Object[]{imageAdapter}) : imageAdapter.mContext;
        }

        public ImageAdapter(Context context) {
            this.mContext = context.getApplicationContext();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            if (ImageListView.this.mImgUrls != null) {
                return ImageListView.this.mImgUrls.size();
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
            }
            if (view == null) {
                this.imageview = new RatioImageViewEX(this.mContext);
            } else {
                this.imageview = (RatioImageViewEX) view;
            }
            final String str = ImageListView.this.mImgUrls.get(i);
            ImageStrategyDecider.decideUrl(str, 2000, 2000, ImageListView.access$000(ImageListView.this));
            b.h().a(str).into(this.imageview);
            this.imageview.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.taobao.browser.jsbridge.ui.ImageListView.ImageAdapter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view2})).booleanValue();
                    }
                    if (StringUtils.isEmpty(str) || ImageAdapter.access$100(ImageAdapter.this) == null) {
                        m.e("ImageListView", "save image param error");
                        return false;
                    }
                    TBImageSaveView.getInstance().save(str, ImageAdapter.access$100(ImageAdapter.this), view2);
                    return true;
                }
            });
            return this.imageview;
        }
    }
}
