1. add RecyclerView in activity_main
2. create card_design.xml in layout folder
   - android:layout_width="match_parent"
   - android:layout_height="wrap_content"
3. add CardView in card_design 
4. add ConstraintLayout in CardView 
   - height  75dp
5. add dependency for CircleImageView
6. add pictures in drawable folder
7. add all the components in card_design
8. add card_design into activity_main
9. make sure all components have ID
10. create recyclerView var and findById in MainActivity.kt
11. set layoutManager for recyclerView
12. create arrayList for countries, details and img and populate the data
13. create CountriesAdapter class
14. create constructor for country list, details, images and context
15. create inner class CountryViewHolder and inherit RecyclerView.ViewHolder
16. in the inner class, create var for textViewCountryName, textViewDetails, imageView and cardView and find by id for all of them
17. override fun members
18. in onCreateViewHolder, create view var and set the LayoutInflater and return CountryViewHolder(view)
19. in getItemCount, simply return countryNameList.size
20. in onBindViewHolder
    - assign values to textViewCountryname, textViewDetails and imageView base in position
    - set on click listener to cardView to call Toast message