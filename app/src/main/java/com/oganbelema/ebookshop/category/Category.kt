package com.oganbelema.ebookshop.category

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.room.*
import com.oganbelema.ebookshop.BR

@Entity(tableName = "category_table", indices = [Index("id")])
class Category(categoryName: String, categoryDescription: String) : BaseObservable() {

    @PrimaryKey(autoGenerate = true)
    @Bindable
    var id: Int = 0
    set(value) {
        field = value
        notifyPropertyChanged(BR.id)
    }

    @Bindable
    @ColumnInfo(name = "category_name")
    var categoryName: String = categoryName
    set(value){
        field = value
        notifyPropertyChanged(BR.categoryName)
    }

    @Bindable
    @ColumnInfo(name = "category_description")
    var categoryDescription: String = categoryDescription
    set(value) {
        field = value
        notifyPropertyChanged(BR.categoryDescription)
    }

    @Ignore
    override fun toString(): String {
        return categoryName
    }
}