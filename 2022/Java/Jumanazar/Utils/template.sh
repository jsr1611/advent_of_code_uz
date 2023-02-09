
echo "Enter the day number of Advent of Code"
read dayNumber
mkdir ../day$dayNumber && cd ../day$dayNumber && touch day$dayNumber.java && cat ../Utils/Day_template.java >> day$dayNumber.java && touch sample_input.txt && touch input.txt