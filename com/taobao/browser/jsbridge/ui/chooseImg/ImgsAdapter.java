package com.taobao.browser.jsbridge.ui.chooseImg;

import android.content.Context;
import android.graphics.Bitmap;
import android.taobao.windvane.util.m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class ImgsAdapter extends BaseAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context context;
    public List<String> data;
    public OnItemClickClass onItemClickClass;
    public ImgChooseUtils util;

    /* loaded from: classes6.dex */
    public interface OnItemClickClass {
        void OnItemClick(View view, int i, CheckBox checkBox);
    }

    static {
        kge.a(621395652);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
    }

    public ImgsAdapter(Context context, List<String> list, OnItemClickClass onItemClickClass) {
        this.context = context;
        this.data = list;
        this.onItemClickClass = onItemClickClass;
        this.util = new ImgChooseUtils(context);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : this.data.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)}) : this.data.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImgHolder imgHolder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        if (view == null) {
            view = LayoutInflater.from(this.context).inflate(R.layout.camera_imgsitem, (ViewGroup) null);
            imgHolder = new ImgHolder();
            imgHolder.imageView = (ImageView) view.findViewById(R.id.imgItemView);
            imgHolder.checkBox = (CheckBox) view.findViewById(R.id.imgCheckBox);
            view.setTag(imgHolder);
        } else {
            imgHolder = (ImgHolder) view.getTag();
            if (((ImgsActivity) this.context).fileList.contains(this.data.get(i))) {
                imgHolder.checkBox.setChecked(true);
            } else {
                imgHolder.checkBox.setChecked(false);
            }
        }
        imgHolder.index = i;
        imgHolder.imageView.setImageResource(R.drawable.camera_pictures_no);
        imgHolder.imageView.setTag(imgHolder);
        this.util.imgExcute(imgHolder, new ImgClallBackLisner(i), this.data.get(i));
        view.setOnClickListener(new a(i, imgHolder.checkBox));
        return view;
    }

    /* loaded from: classes6.dex */
    public class ImgClallBackLisner implements ImgCallBack {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int num;

        static {
            kge.a(47670657);
            kge.a(1438995437);
        }

        public ImgClallBackLisner(int i) {
            this.num = i;
        }

        @Override // com.taobao.browser.jsbridge.ui.chooseImg.ImgCallBack
        public void resultImgCall(ImageView imageView, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff219569", new Object[]{this, imageView, bitmap});
                return;
            }
            if (imageView.getTag() instanceof ImgHolder) {
                ImgHolder imgHolder = (ImgHolder) imageView.getTag();
                if (this.num != imgHolder.index) {
                    String str = ImgsActivity.TAG;
                    m.d(str, "ignore img bitmap callback for:" + this.num + ",holder index:" + imgHolder.index);
                    return;
                }
            }
            imageView.setImageBitmap(bitmap);
        }
    }

    /* loaded from: classes6.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f16833a;
        public CheckBox b;

        static {
            kge.a(-695229515);
            kge.a(-1201612728);
        }

        public a(int i, CheckBox checkBox) {
            this.f16833a = i;
            this.b = checkBox;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (ImgsAdapter.this.data == null || ImgsAdapter.this.onItemClickClass == null) {
            } else {
                ImgsAdapter.this.onItemClickClass.OnItemClick(view, this.f16833a, this.b);
            }
        }
    }
}
