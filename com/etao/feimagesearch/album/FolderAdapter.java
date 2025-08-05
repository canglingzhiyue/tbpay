package com.etao.feimagesearch.album;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.album.thumbnail.d;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes3.dex */
public class FolderAdapter extends BaseAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Context mContext;
    private final List<k> mFolders;
    private com.etao.feimagesearch.album.thumbnail.a thumbnailExecutor;
    private final Map<View, d> thumbLoaderCaches = new HashMap();
    private int mCurrentSelection = -1;

    static {
        kge.a(1225935154);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
    }

    public FolderAdapter(Context context, List<k> list, com.etao.feimagesearch.album.thumbnail.a aVar) {
        this.mContext = context;
        this.mFolders = list;
        this.thumbnailExecutor = aVar;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : this.mFolders.size();
    }

    @Override // android.widget.Adapter
    /* renamed from: getItem */
    public k mo619getItem(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("e58bccf6", new Object[]{this, new Integer(i)}) : this.mFolders.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        if (view == null) {
            view = LayoutInflater.from(this.mContext).inflate(R.layout.feis_album_folder_list_item, (ViewGroup) null, false);
        }
        TextView textView = (TextView) view.findViewById(R.id.folder_list_name);
        TextView textView2 = (TextView) view.findViewById(R.id.folder_list_count);
        TUrlImageView tUrlImageView = (TUrlImageView) view.findViewById(R.id.folder_list_thumb);
        k mo619getItem = mo619getItem(i);
        d dVar = this.thumbLoaderCaches.get(view);
        if (dVar == null) {
            dVar = new d(this.thumbnailExecutor);
            this.thumbLoaderCaches.put(view, dVar);
        }
        if (mo619getItem.f()) {
            dVar.a(mo619getItem.e().get(0), tUrlImageView);
        } else {
            dVar.a();
        }
        textView.setText(mo619getItem.a());
        if (mo619getItem.d()) {
            this.mCurrentSelection = i;
        }
        if (i == 0) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(mo619getItem.c());
        }
        return view;
    }

    public void select(ListView listView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("406eed73", new Object[]{this, listView, new Integer(i)});
            return;
        }
        int i2 = this.mCurrentSelection;
        if (i2 == i) {
            return;
        }
        if (i2 >= 0) {
            mo619getItem(i2).a(false);
        }
        mo619getItem(i).a(true);
        this.mCurrentSelection = i;
    }

    private void refreshView(ListView listView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a73dfd97", new Object[]{this, listView, new Integer(i)});
            return;
        }
        listView.getFirstVisiblePosition();
        listView.getLastVisiblePosition();
    }
}
