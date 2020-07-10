package com.shenkai.confiict.fragment;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Author:shenkai
 * Time:2020/7/10 16:38
 * Description:
 */
public class NestedLogRecyclerView extends RecyclerView {
    private static final String TAG = "RecyclerViewNestedLog";

    public NestedLogRecyclerView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void setNestedScrollingEnabled(boolean enabled) {
        Log.e(TAG, "setNestedScrollingEnabled");
        super.setNestedScrollingEnabled(enabled);
    }

    @Override
    public boolean isNestedScrollingEnabled() {
        Log.e(TAG, "isNestedScrollingEnabled");
        return super.isNestedScrollingEnabled();
    }

    @Override
    public boolean startNestedScroll(int axes) {
        Log.e(TAG, "startNestedScroll");
        return super.startNestedScroll(axes);
    }

    @Override
    public boolean startNestedScroll(int axes, int type) {
        Log.e(TAG, "startNestedScroll");
        return super.startNestedScroll(axes, type);
    }

    @Override
    public void stopNestedScroll() {
        Log.e(TAG,  "stopNestedScroll");
        super.stopNestedScroll();
    }

    @Override
    public void stopNestedScroll(int type) {
        Log.e(TAG, "stopNestedScroll");
        super.stopNestedScroll(type);
    }

    @Override
    public boolean hasNestedScrollingParent() {
        Log.e("RecyclerViewNestedLog", "hasNestedScrollingParent");
        return super.hasNestedScrollingParent();
    }

    @Override
    public boolean hasNestedScrollingParent(int type) {
        Log.e("RecyclerViewNestedLog", "hasNestedScrollingParent");
        return super.hasNestedScrollingParent(type);
    }

    @Override
    public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow) {
        Log.e(TAG, "dispatchNestedScroll");
        return super.dispatchNestedScroll(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow);
    }

    @Override
    public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type) {
        Log.e(TAG, "dispatchNestedScroll");
        return super.dispatchNestedScroll(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, type);
    }

    @Override
    public boolean dispatchNestedPreScroll(int dx, int dy, int[] consumed, int[] offsetInWindow) {
        Log.e(TAG, "dispatchNestedPreScroll");
        return super.dispatchNestedPreScroll(dx, dy, consumed, offsetInWindow);
    }

    @Override
    public boolean dispatchNestedPreScroll(int dx, int dy, int[] consumed, int[] offsetInWindow, int type) {
        Log.e(TAG, "dispatchNestedPreScroll");
        return super.dispatchNestedPreScroll(dx, dy, consumed, offsetInWindow, type);
    }

    @Override
    public boolean dispatchNestedFling(float velocityX, float velocityY, boolean consumed) {
        Log.e(TAG, "dispatchNestedFling");
        return super.dispatchNestedFling(velocityX, velocityY, consumed);
    }

    @Override
    public boolean dispatchNestedPreFling(float velocityX, float velocityY) {
        Log.e(TAG, "dispatchNestedPreFling");
        return super.dispatchNestedPreFling(velocityX, velocityY);
    }
}
