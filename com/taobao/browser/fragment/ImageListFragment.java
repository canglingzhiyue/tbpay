package com.taobao.browser.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.jsbridge.ui.ImageListView;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes6.dex */
public class ImageListFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String TAG = "ImageListFragmentContainer";
    public ArrayList<String> mImageUrls = new ArrayList<>();
    private View mView = null;
    private ImageListView mVerticalImageView = null;

    static {
        kge.a(-1268536156);
    }

    public static /* synthetic */ Object ipc$super(ImageListFragment imageListFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != -641568046) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        String[] stringArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        BrowserUtil.a(this.TAG, BrowserUtil.b, BrowserUtil.c, null, null);
        Bundle arguments = getArguments();
        if (arguments == null || (stringArray = arguments.getStringArray("image_list_urls")) == null) {
            return;
        }
        for (String str : stringArray) {
            if (str != null) {
                this.mImageUrls.add(str);
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        this.mView = layoutInflater.inflate(R.layout.verticalimagelist_layout, viewGroup, false);
        this.mView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.browser.fragment.ImageListFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                try {
                    ImageListFragment.this.getActivity().finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        this.mVerticalImageView = (ImageListView) this.mView.findViewById(R.id.image_Verticallist);
        this.mVerticalImageView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.taobao.browser.fragment.ImageListFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dafa70", new Object[]{this, adapterView, view, new Integer(i), new Long(j)});
                    return;
                }
                try {
                    ImageListFragment.this.getActivity().finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        if (this.mVerticalImageView.setImageUrls(this.mImageUrls)) {
            this.mVerticalImageView.setVisibility(0);
            this.mVerticalImageView.invalidate();
        } else {
            this.mVerticalImageView.setVisibility(8);
        }
        return this.mView;
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ImageListView imageListView = this.mVerticalImageView;
        if (imageListView != null) {
            imageListView.destroy();
        }
        this.mVerticalImageView = null;
    }
}
