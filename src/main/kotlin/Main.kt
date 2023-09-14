fun main(args: Array<String>) {
    val db: Database = Database();

    var categories: List<Category> = db.getCategories();
    var features: List<Feature> = db.getFeatures();

    categories = categories.sortedBy { it.categoryId };
    features = features.sortedBy { it.featureId };

    val mergedList: List<Any> = mergeCategoriesAndFeatures(categories, features);

    for (it in mergedList) {
        if (it is Category) {
            println("Category: " + it.name);
        }
        else if (it is Feature) {
            println("Feature: " + it.title);
        }
    }
}

fun mergeCategoriesAndFeatures(categories: List<Category>, features: List<Feature>): List<Any> {
    val result = mutableListOf<Any>();

    for (category in categories) {
        result.add(category);

        for (feature in features) {
            if (feature.categoryId == category.categoryId) {
                result.add(feature);
            }
        }

        result.add(category.categoryId);
    }

    return result;
}
